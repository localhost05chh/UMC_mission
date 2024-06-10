package com.example.umc_mission.converter;

import com.example.umc_mission.domain.Region;
import com.example.umc_mission.domain.Restaurant;
import com.example.umc_mission.domain.enums.RestaurantStatus;
import com.example.umc_mission.web.dto.restaurantDTO.RestaurantRequestDTO;
import com.example.umc_mission.web.dto.restaurantDTO.RestaurantResponseDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


public class RestaurantConverter {
    public static List<Restaurant> toRestaurantList(List<Region> RegionList) {
        return RegionList.stream()
                .map(region ->
                        Restaurant.builder()
                                .region(region)
                                .build()
                ).collect(Collectors.toList());
    }

    public static RestaurantResponseDTO.RestaurantResultDTO toRestaurantResultDTO(Restaurant restaurant){
        return  RestaurantResponseDTO.RestaurantResultDTO.builder()
                .restaurantId(restaurant.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Restaurant torestaurant(RestaurantRequestDTO.RestaurantDto request){
        RestaurantStatus restaurantStatus = switch (request.getRestaurantStatus()) {
            case 1 -> RestaurantStatus.OPEN;
            case 2 -> RestaurantStatus.CLOSE;
            default -> null;
        };


        return Restaurant.builder()
                .restaurantName(request.getRestaurantName())
                .restaurantLocation(request.getRestaurantLocation())
                .restaurantStatus(restaurantStatus)
                .rating(request.getRating())
                .build();
    }

}
