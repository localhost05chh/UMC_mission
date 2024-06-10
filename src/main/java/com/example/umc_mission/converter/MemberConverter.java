package com.example.umc_mission.converter;

import com.example.umc_mission.domain.Member;
import com.example.umc_mission.domain.enums.Gender;
import com.example.umc_mission.web.dto.memberDTO.MemberRequestDTO;
import com.example.umc_mission.web.dto.memberDTO.MemberResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class MemberConverter {

     public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member){
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

     public static Member toMember(MemberRequestDTO.JoinDto request){

        Gender gender = null;

        switch (request.getGender()){
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            case 3:
                gender = Gender.NONE;
                break;
        }

        return Member.builder()
                .address(request.getAddress())
                .gender(gender)
                .userName(request.getName())
                .nickname(request.getNickname())
                .memberSelectFoodList(new ArrayList<>())
                .build();
    }
}
