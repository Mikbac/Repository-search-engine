package com.controller;


import com.exception.ApiRateLimitException;
import com.exception.SomethingException;
import com.model.Repository;
import com.service.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;


@CrossOrigin
@RestController
public class RepositoryController {

    private RepositoryService repositoryService;

    @Autowired
    public RepositoryController(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }


    @RequestMapping(value = "organization/{organizationName}/last-modified-repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Repository getLastModifiedRepository(@PathVariable String organizationName) {
        try {
            return repositoryService.getLastUpdatedRepository(organizationName);
        } catch (HttpStatusCodeException e) {
            throw new ApiRateLimitException();
        } catch (Exception e) {
            e.printStackTrace();
            throw new SomethingException();
        }

    }
}
