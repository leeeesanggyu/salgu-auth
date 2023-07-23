package com.salgu.salguauth.account.exception;

import com.salgu.salguauth.util.exception.CustomException;
import com.salgu.salguauth.util.response.ResponseCode;
import lombok.Getter;

@Getter
public class AccountException extends CustomException {

	private ResponseCode responseCodeEnum = null;

	public AccountException(String message) {
		super(message);
	}

	public AccountException(ResponseCode code) {
		super(code.getMessage());
		this.responseCodeEnum = code;
	}

	public AccountException(ResponseCode code, String message) {
		super(message);
		this.responseCodeEnum = code;
	}
}