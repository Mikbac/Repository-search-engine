package com.controller;


import com.RepositoryData;
import com.exception.InvalidUserNameException;
import com.model.Repository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class RepositoryController {

    @RequestMapping(value = "user/{userName}/repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Repository getRepository(@PathVariable String userName) throws Exception {
        try {
            return RepositoryData.getRepository(userName);
        } catch (Exception e) {
            throw new InvalidUserNameException();
        }
    }


}
