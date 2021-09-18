package pl.mikbac.search_engine.spring.controller.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.mikbac.search_engine.data.impl.RepositoryData;
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
    @ResponseBody
    public RepositoryData getLastModifiedRepository(@PathVariable final String organizationName) {
        log.info("[getLastModifiedRepository] -- for organizationName: {}", () -> organizationName);
        return repositoryFacade.getLastModifiedRepository(organizationName);
    }

}
