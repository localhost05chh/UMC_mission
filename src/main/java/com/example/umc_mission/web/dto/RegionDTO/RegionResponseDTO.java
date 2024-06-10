package com.example.umc_mission.web.dto.RegionDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class RegionResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RegionCreateDTO{
        Long RegionId;
        LocalDateTime createdAt;
    }
}
