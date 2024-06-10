package com.example.umc_mission.converter;

import com.example.umc_mission.domain.Region;
import com.example.umc_mission.web.dto.RegionDTO.RegionRequestDTO;
import com.example.umc_mission.web.dto.RegionDTO.RegionResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RegionConverter {
    public static RegionResponseDTO.RegionCreateDTO toRegionCreateDTO(Region region) {
        return RegionResponseDTO.RegionCreateDTO.builder()
                .RegionId(region.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Region toRegion(RegionRequestDTO.RegionDto request) {
        return Region.builder()
                .regionName(request.getRegionName())
                .restaurantList(new ArrayList<>())
                .build();
    }
}
