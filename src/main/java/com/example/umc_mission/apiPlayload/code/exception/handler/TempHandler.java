package com.example.umc_mission.apiPlayload.code.exception.handler;

import com.example.umc_mission.apiPlayload.code.BaseErrorCode;
import com.example.umc_mission.apiPlayload.code.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
