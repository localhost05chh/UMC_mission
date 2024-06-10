package com.example.umc_mission.service.RestaurantService;

import com.example.umc_mission.domain.Restaurant;
import com.example.umc_mission.repository.RestaurantCategoryRepository;
import com.example.umc_mission.web.dto.restaurantDTO.RestaurantRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RestaurantCommandServiceImpl implements RestaurantCommandService {

    private final RestaurantCategoryRepository restaurantCategoryRepository;

    @Override
    public Restaurant createRestaurant(RestaurantRequestDTO.RestaurantDto request) {
        return null;
    }
}
