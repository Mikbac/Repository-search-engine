package com.controller;


import com.RepositoryData;
import com.exception.ApiRateLimitException;
import com.exception.InvalidUsernameException;
import com.model.Repository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.io.IOException;


@CrossOrigin
@RestController
public class RepositoryController {

    @RequestMapping(value = "user/{username}/repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Repository getLastModifiedRepository(@PathVariable String username) throws Exception {
        try {
            return RepositoryData.getRepository(username);
        }
        catch (IOException e) {
            throw new ApiRateLimitException();
        }
        catch (Exception e) {
            throw new InvalidUsernameException();
        }
    }


}
