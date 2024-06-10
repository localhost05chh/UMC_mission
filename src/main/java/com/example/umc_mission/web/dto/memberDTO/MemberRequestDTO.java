package com.example.umc_mission.web.dto.memberDTO;

import com.example.umc_mission.validation.annotation.ExistCategories;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

public class MemberRequestDTO {

    @Getter
    public static class JoinDto{
        String name;
        String email;
        String phone;
        int gender;
        String address;
        String birthday;
        String nickname;
        String phoneCheck;
        int successMission;
        int myPoint;
        String status;
        LocalDateTime inactive;
        LocalDateTime updatedAt;
        @ExistCategories
        List<Long> preferCategory;
    }
}
