package com.controller;


import com.exception.ApiRateLimitException;
import com.exception.InvalidUsernameException;
import com.model.Repository;
import com.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@CrossOrigin
@RestController
public class RepositoryController {

    private RepositoryService repositoryService;

    @Autowired
    public RepositoryController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }


    @RequestMapping(value = "user/{username}/last-modified-repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Repository getLastModifiedRepository(@PathVariable String username) {
        try {
            return repositoryService.getLastUpdatedRepository(username);
        } catch (IOException e) {
            throw new ApiRateLimitException();
        } catch (Exception e) {
            throw new InvalidUsernameException();
        }

    }
}
