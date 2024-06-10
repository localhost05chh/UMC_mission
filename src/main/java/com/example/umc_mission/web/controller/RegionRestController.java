package com.example.umc_mission.web.controller;

import com.example.umc_mission.apiPlayload.ApiResponse;
import com.example.umc_mission.repository.RegionRepository;
import com.example.umc_mission.service.RegionService.RegionCommandService;
import com.example.umc_mission.web.dto.RegionDTO.RegionRequestDTO;
import com.example.umc_mission.web.dto.RegionDTO.RegionResponseDTO;
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

    private final RegionCommandService regionCommandService;

    @PostMapping("/")
    public ApiResponse<RegionResponseDTO.RegionCreateDTO> join(@RequestBody @Valid RegionRequestDTO.RegionDto request){
        return null;
    }
}
