package com.example.umc_mission.web.dto.restaurantDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class RestaurantResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class RestaurantResultDTO{
        Long restaurantId;
        LocalDateTime createdAt;
    }
}
