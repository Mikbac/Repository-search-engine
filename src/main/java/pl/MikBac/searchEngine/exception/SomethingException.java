/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SomethingException extends RuntimeException {
    public SomethingException() {
        super("Something went wrong!");
    }
}
