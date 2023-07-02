package com.salgu.salguauth.account.dto;

import lombok.Data;

public class SignInDto {

    @Data
    public static class Req {
        private String email;
        private String password;
    }
}
