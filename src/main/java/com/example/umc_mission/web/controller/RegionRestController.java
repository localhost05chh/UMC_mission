package com.example.umc_mission.web.controller;

import com.example.umc_mission.apiPlayload.ApiResponse;
import com.example.umc_mission.converter.RestaurantConverter;
import com.example.umc_mission.domain.Region;
import com.example.umc_mission.domain.Restaurant;
import com.example.umc_mission.repository.RegionRepository;
import com.example.umc_mission.service.RegionService.RegionCommandService;
import com.example.umc_mission.service.RestaurantService.RestaurantCommandService;
import com.example.umc_mission.web.dto.RegionDTO.RegionRequestDTO;
import com.example.umc_mission.web.dto.RegionDTO.RegionResponseDTO;
import com.example.umc_mission.web.dto.restaurantDTO.RestaurantRequestDTO;
import com.example.umc_mission.web.dto.restaurantDTO.RestaurantResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/regions")
public class RegionRestController {


    private final RestaurantCommandService restaurantCommandService;

    @PostMapping("/")
    public ApiResponse<RestaurantResponseDTO.RestaurantResultDTO> join(@RequestBody @Valid RestaurantRequestDTO.RestaurantDto request){
        Restaurant restaurant = restaurantCommandService.createRestaurant(request);
        return ApiResponse.onSuccess(RestaurantConverter.toRestaurantResultDTO(restaurant));
    }
}
