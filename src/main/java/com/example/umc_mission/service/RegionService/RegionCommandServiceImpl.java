package com.example.umc_mission.service.RegionService;

import com.example.umc_mission.apiPlayload.code.exception.handler.RestaurantCategoryHandler;
import com.example.umc_mission.apiPlayload.code.status.ErrorStatus;
import com.example.umc_mission.converter.RegionConverter;
import com.example.umc_mission.converter.RestaurantConverter;
import com.example.umc_mission.domain.Region;
import com.example.umc_mission.domain.Restaurant;
import com.example.umc_mission.repository.RegionRepository;
import com.example.umc_mission.repository.RestaurantCategoryRepository;
import com.example.umc_mission.web.dto.RegionDTO.RegionRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RegionCommandServiceImpl implements RegionCommandService{

    private final RegionRepository regionRepository;

    private final RestaurantCategoryRepository restaurantCategoryRepository;

    @Override
    public Region createRegion(RegionRequestDTO.RegionDto request) {

        Region newRegion = RegionConverter.toRegion(request);
        List<Restaurant> restaurantCategoryList = request.getRestaurantCategory().stream()
                .map(category -> {
                    return restaurantCategoryRepository.findById(category).orElseThrow(() -> new RestaurantCategoryHandler(ErrorStatus.RESTAURANT_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<Restaurant> restaurantList = RestaurantConverter.toRestaurantList(restaurantCategoryList);
        return null;
    }
}
