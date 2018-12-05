package com.system.exception.custom;

import com.system.exception.CustomException;

public class UserLoginException extends CustomException{

	private static final long serialVersionUID = 1L;

	public UserLoginException(String message) {
		super(message);
	}

}
