package com.salgu.salguauth.util.response;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ResponseCodeEnum implements ResponseCode {
    SUCCESS(0,"success"),
    FAILED(-1,"failed"),
    ;

    private final int code;
    private final String message;

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
