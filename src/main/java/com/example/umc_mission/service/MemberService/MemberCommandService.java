package com.example.umc_mission.service.MemberService;

import com.example.umc_mission.domain.Member;
import com.example.umc_mission.web.dto.memberDTO.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDto request);
}
