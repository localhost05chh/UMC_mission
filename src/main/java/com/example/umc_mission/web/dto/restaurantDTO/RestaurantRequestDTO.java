package com.example.umc_mission.web.dto.restaurantDTO;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

public class RestaurantRequestDTO {

    @Getter
    public static class RestaurantDto {
        int regionId;
        String restaurantName;
        String restaurantLocation;
        int rating;
        int restaurantStatus;
        LocalDateTime updatedAt;
    }
}
