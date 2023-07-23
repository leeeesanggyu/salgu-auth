package com.salgu.salguauth.util.exception;

import com.salgu.salguauth.util.response.ResponseCode;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

	private ResponseCode responseCodeEnum = null;

	public CustomException(String message) {
		super(message);
	}

	public CustomException(ResponseCode code) {
		super(code.getMessage());
		this.responseCodeEnum = code;
	}

	public CustomException(ResponseCode code, String message) {
		super(message);
		this.responseCodeEnum = code;
	}
}