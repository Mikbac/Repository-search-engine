package pl.mikbac.search_engine.spring.controller.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import pl.mikbac.search_engine.data.impl.RepositoryData;
import pl.mikbac.search_engine.exception.ApiRateLimitException;
import pl.mikbac.search_engine.exception.RepositoryNotFoundException;
import pl.mikbac.search_engine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;

import static pl.mikbac.search_engine.constants.WebConstants.Mapping.LAST_MODIFIED_REPOSITORY;
import static pl.mikbac.search_engine.constants.WebConstants.Mapping.REPOSITORIES;

/**
 * Created by MikBac on 2019
 */

@Log4j2
@CrossOrigin
@RestController
@RequestMapping(value = REPOSITORIES)
public class RepositoryController {

    @Resource
    private RepositoryFacade repositoryFacade;

    @GetMapping(value = LAST_MODIFIED_REPOSITORY, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RepositoryData> getLastModifiedRepository(@PathVariable final String organizationName) {
        log.info("Last Modified Repository for organizationName: {}", () -> organizationName);
        try {
            return ResponseEntity.ok(repositoryFacade.getLastModifiedRepository(organizationName));
        } catch (ApiRateLimitException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "GitHub api rate limit!", e);
        } catch (RepositoryNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Organization not found!", e);
        }
    }

}
