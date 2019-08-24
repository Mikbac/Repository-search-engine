package pl.MikBac.searchEngine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by MikBac on 2019
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiRateLimitException extends RuntimeException {

    public ApiRateLimitException(String organizationName) {
        super("GitHub API rate limit for organization name: " + organizationName);
    }

}
