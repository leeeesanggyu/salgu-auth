package com.salgu.salguauth.account.service;

import com.salgu.salguauth.account.dto.SignInDto;
import com.salgu.salguauth.account.exception.AccountException;
import com.salgu.salguauth.account.responsecode.AccountResponseCodeEnum;
import com.salgu.salguauth.util.response.ResponseWithData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class SignInService {

    @Value("${service.api}")
    private String API_URL;

    private final RestTemplate restTemplate;

    public void signIn(SignInDto.Req dto) {
        userVerification(dto.getEmail());
    }

    public void userVerification(String email) {
        ResponseWithData result = null;
        try {
            result = restTemplate.getForObject(
                    "http://" + API_URL + "/user/verification/" + email,
                    ResponseWithData.class
            );
            log.info("API_URL + /user/verification => {}", result);
        } catch (Exception e) {
            throw new AccountException(AccountResponseCodeEnum.VERIFICATION_ERROR);
        }

        if (result.getResponse().getOutput() != 0) {
            throw new AccountException(AccountResponseCodeEnum.VERIFICATION_ERROR);
        }
    }
}
