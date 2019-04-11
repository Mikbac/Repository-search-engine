package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidUserNameException extends RuntimeException{
    public InvalidUserNameException() {
        super("This user name does not exist or user does not have any repositories!");
    }
}
