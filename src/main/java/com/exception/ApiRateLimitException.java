package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiRateLimitException extends RuntimeException {
    public ApiRateLimitException() {
        super("GitHub API rate limit!");
    }
}
