/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import pl.MikBac.searchEngine.exception.ApiRateLimitException;
import pl.MikBac.searchEngine.exception.SomethingException;
import pl.MikBac.searchEngine.model.Repository;
import pl.MikBac.searchEngine.spring.service.RepositoryService;

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
