/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.repository;

import org.springframework.web.client.RestTemplate;
import pl.MikBac.searchEngine.model.Repository;

import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Repository
public class RepositoryRepository {

    public List<Repository> getRepositories(String organizationName, int pagesNumber) {

        String url;
        Repository[] repositories;

        url = "https://api.github.com/orgs/" + organizationName + "/repos?per_page=" + pagesNumber;
        repositories = readRepositories(url);

        return Arrays.asList(repositories);
    }

    private Repository[] readRepositories(String url) {
        RestTemplate restTemplate = new RestTemplate();
        Repository[] repositories = restTemplate.getForObject(url, Repository[].class);

        return repositories;
    }

}
