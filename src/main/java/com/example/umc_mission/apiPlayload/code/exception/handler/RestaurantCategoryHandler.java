package com.example.umc_mission.apiPlayload.code.exception.handler;

import com.example.umc_mission.apiPlayload.code.BaseErrorCode;
import com.example.umc_mission.apiPlayload.code.exception.GeneralException;

public class RestaurantCategoryHandler extends GeneralException {
    public RestaurantCategoryHandler(BaseErrorCode baseErrorCode) {
        super(baseErrorCode);
    }
}
