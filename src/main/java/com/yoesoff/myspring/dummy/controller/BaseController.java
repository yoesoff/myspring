package com.yoesoff.myspring.dummy.controller;

import com.yoesoff.myspring.dto.response.GeneralResponseDTO;

import java.util.List;

public class BaseController {
    protected GeneralResponseDTO response(Object obj, boolean isArr, String msg) {
        return GeneralResponseDTO.builder()
            .message(msg)
            .data(isArr? obj : List.of(obj))
            .build();
    }
}
