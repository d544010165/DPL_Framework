package com.system.exception.custom;

import com.system.exception.CustomException;

public class FileException extends CustomException {
    private static final long serialVersionUID = 1L;

    public FileException(String message) {
        super(message);
    }
}
