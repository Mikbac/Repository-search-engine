package pl.MikBac.searchEngine.spring.controller.API;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.MikBac.searchEngine.constants.WebConstants.Mapping;
import pl.MikBac.searchEngine.data.impl.RepositoryData;
import pl.MikBac.searchEngine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;

import static pl.MikBac.searchEngine.constants.WebConstants.Mapping.REPOSITORY;

/**
 * Created by MikBac on 2019
 */

@Log4j2
@CrossOrigin
@RestController
@RequestMapping(value = REPOSITORY)
public class RepositoryController {

    @Resource
    private RepositoryFacade repositoryFacade;

    @GetMapping(value = Mapping.LAST_MODIFIED_REPOSITORY, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RepositoryData getLastModifiedRepository(@PathVariable final String organization) {
        log.info("[getLastModifiedRepository] -- for organizationName: {}", () -> organization);
        return repositoryFacade.getLastModifiedRepository(organization);
    }

}
