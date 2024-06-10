package com.example.umc_mission.repository;

import com.example.umc_mission.domain.Region;
import com.example.umc_mission.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantCategoryRepository extends JpaRepository<Region, Long> {
}
