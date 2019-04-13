package com.controller;

import com.RepositoryData;
import com.exception.ApiRateLimitException;
import com.exception.InvalidUsernameException;
import com.model.Repository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
public class RepositoryController {

    @RequestMapping(value = "user/{username}/repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Repository getLastModifiedRepository(@PathVariable String username) throws Exception {
        try {
            Repository repository;
            repository = RepositoryData.getRepository(username);

            if (repository != null) {
                return repository;
            } else {
                throw new InvalidUsernameException();
            }
        } catch (IOException e) {
            throw new ApiRateLimitException();
        }
    }
}
