package com.example.umc_mission.service.RegionService;

import com.example.umc_mission.domain.Region;
import com.example.umc_mission.web.dto.RegionDTO.RegionRequestDTO;

public interface RegionCommandService {
    Region createRegion(RegionRequestDTO.RegionDto request);
}
