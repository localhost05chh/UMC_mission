package com.example.umc_mission.apiPlayload.code.exception.handler;

import com.example.umc_mission.apiPlayload.code.BaseErrorCode;
import com.example.umc_mission.apiPlayload.code.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode baseErrorCode) {
        super(baseErrorCode);
    }

}
