package com.example.umc_mission.repository;

import com.example.umc_mission.domain.PreferFood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<PreferFood, Long> {
}
