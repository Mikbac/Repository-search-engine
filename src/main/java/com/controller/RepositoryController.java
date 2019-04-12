package com.controller;


import com.RepositoryData;
import com.exception.InvalidUsernameException;
import com.model.Repository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class RepositoryController {

    @RequestMapping(value = "user/{username}/repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Repository getLastModifiedRepository(@PathVariable String username) throws Exception {
        try {
            return RepositoryData.getRepository(username);
        } catch (Exception e) {
            throw new InvalidUsernameException();
        }
    }


}
