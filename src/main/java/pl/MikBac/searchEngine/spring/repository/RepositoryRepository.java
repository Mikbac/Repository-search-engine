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

        String url;
        RepositoryModel[] repositories;

        url = "https://api.github.com/orgs/" + organizationName + "/repos?per_page=" + pagesNumber;
        repositories = readRepositories(url);

        return Arrays.asList(repositories);
    }

    private RepositoryModel[] readRepositories(String url) {
        RestTemplate restTemplate = new RestTemplate();
        RepositoryModel[] repositories = restTemplate.getForObject(url, RepositoryModel[].class);

        return repositories;
    }

}
