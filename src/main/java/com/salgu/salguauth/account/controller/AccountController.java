package com.salgu.salguauth.account.controller;

import com.salgu.salguauth.account.dto.SignInDto;
import com.salgu.salguauth.account.service.SignInService;
import com.salgu.salguauth.util.response.ResponseWithData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountController {

    private final SignInService signInService;

    @PostMapping("/sign-in")
    public ResponseWithData signIn(
            @RequestBody SignInDto.Req req
    ) {
        boolean result = signInService.userVerification(req.getEmail());
        return ResponseWithData.success(result);
    }
}
