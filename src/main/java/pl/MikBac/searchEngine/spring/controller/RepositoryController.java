/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.MikBac.searchEngine.model.RepositoryModel;
import pl.MikBac.searchEngine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class RepositoryController {

    @Resource
    RepositoryFacade repositoryFacade;

    @RequestMapping(value = "organization/{organizationName}/last-modified-repository", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public RepositoryModel getLastModifiedRepository(@PathVariable String organizationName) {

        return repositoryFacade.getLastModifiedRepository(organizationName);
    }
}
