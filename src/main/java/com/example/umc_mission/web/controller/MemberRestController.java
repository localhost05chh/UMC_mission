package com.example.umc_mission.web.controller;

import com.example.umc_mission.apiPlayload.ApiResponse;
import com.example.umc_mission.converter.MemberConverter;
import com.example.umc_mission.domain.Member;
import com.example.umc_mission.service.MemberService.MemberCommandService;
import com.example.umc_mission.web.dto.memberDTO.MemberRequestDTO;
import com.example.umc_mission.web.dto.memberDTO.MemberResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

     private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request) {
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}
