package com.salgu.salguauth.account.responsecode;

import com.salgu.salguauth.util.response.ResponseCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountResponseCodeEnum implements ResponseCode {
    VERIFICATION_ERROR(-1,"유저 검증 오류"),
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
