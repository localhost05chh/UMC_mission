package com.example.umc_mission.web.dto.RegionDTO;


import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

public class RegionRequestDTO {

    @Getter
    public static class RegionDto{
        String regionName;
        LocalDateTime updatedAt;
        List<Long> restaurantCategory;
    }
}
