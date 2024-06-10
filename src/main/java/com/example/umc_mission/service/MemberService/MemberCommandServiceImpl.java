package com.example.umc_mission.service.MemberService;

import com.example.umc_mission.apiPlayload.code.exception.handler.FoodCategoryHandler;
import com.example.umc_mission.apiPlayload.code.status.ErrorStatus;
import com.example.umc_mission.converter.MemberConverter;
import com.example.umc_mission.converter.MemberPreferConverter;
import com.example.umc_mission.domain.Member;
import com.example.umc_mission.domain.PreferFood;
import com.example.umc_mission.domain.mapping.MemberSelectFood;
import com.example.umc_mission.repository.FoodCategoryRepository;
import com.example.umc_mission.repository.MemberRepository;
import com.example.umc_mission.web.dto.memberDTO.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberCommandServiceImpl implements MemberCommandService {

    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    @Override
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        Member newMember = MemberConverter.toMember(request);
        List<PreferFood> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberSelectFood> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }
}
