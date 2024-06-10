package com.example.umc_mission.converter;

import com.example.umc_mission.domain.PreferFood;
import com.example.umc_mission.domain.mapping.MemberSelectFood;

import java.util.List;
import java.util.stream.Collectors;

public class MemberPreferConverter {

    public static List<MemberSelectFood> toMemberPreferList(List<PreferFood> foodCategoryList){

        return foodCategoryList.stream()
                .map(foodCategory ->
                        MemberSelectFood.builder()
                                .preferFood(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}
