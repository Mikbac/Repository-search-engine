package pl.MikBac.searchEngine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by MikBac on 2019
 */

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Organization not found!")
public class RepositoryNotFoundException extends RuntimeException {

    public RepositoryNotFoundException(String organizationName) {
        super("Repository not found for organizationName: " + organizationName);
    }

}
