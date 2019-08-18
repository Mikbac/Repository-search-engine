/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.repository;

import org.springframework.web.client.RestTemplate;
import pl.MikBac.searchEngine.model.RepositoryModel;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryRepository {

    public List<RepositoryModel> getRepositories(String organizationName, int pagesNumber) {
        String url = "https://api.github.com/orgs/" + organizationName + "/repos?per_page=" + pagesNumber;
        RepositoryModel[] repositories;
        repositories = readRepositories(url);
        return Arrays.asList(repositories);
    }

    private RepositoryModel[] readRepositories(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, RepositoryModel[].class);
    }

}
