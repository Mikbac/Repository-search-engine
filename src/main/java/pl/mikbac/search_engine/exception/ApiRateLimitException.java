package pl.mikbac.search_engine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by MikBac on 2019
 */

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "GitHub API rate limit!")
public class ApiRateLimitException extends RuntimeException {

    public ApiRateLimitException() {
        super("GitHub API rate limit error.");
    }

}
