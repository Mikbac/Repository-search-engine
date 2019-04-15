package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SomethingException extends RuntimeException {
    public SomethingException() {
        super("Something went wrong!");
    }
}
