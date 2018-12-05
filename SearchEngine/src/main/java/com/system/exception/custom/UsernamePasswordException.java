package com.system.exception.custom;

import com.system.exception.CustomException;

public class UsernamePasswordException extends CustomException{

	private static final long serialVersionUID = 1L;

	public UsernamePasswordException(String message) {
		super(message);
	}

}
