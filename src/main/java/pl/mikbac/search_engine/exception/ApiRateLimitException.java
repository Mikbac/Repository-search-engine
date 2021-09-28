package pl.mikbac.search_engine.exception;

/**
 * Created by MikBac on 2019
 */

public class ApiRateLimitException extends RuntimeException {

    public ApiRateLimitException() {
        super("GitHub api rate limit error.");
    }

}
