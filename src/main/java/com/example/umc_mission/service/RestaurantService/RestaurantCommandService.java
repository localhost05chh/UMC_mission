package com.example.umc_mission.service.RestaurantService;

import com.example.umc_mission.domain.Restaurant;
import com.example.umc_mission.web.dto.restaurantDTO.RestaurantRequestDTO;

public interface RestaurantCommandService {
    Restaurant createRestaurant(RestaurantRequestDTO.RestaurantDto request);
}
