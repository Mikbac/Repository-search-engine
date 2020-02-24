package pl.MikBac.searchEngine.spring.repository.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.MikBac.searchEngine.model.exte.RepositoryModel;
import pl.MikBac.searchEngine.spring.repository.RepositoryRepository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by MikBac on 2019
 */

@Log4j2
@Repository
public class RepositoryRepositoryImpl implements RepositoryRepository {

    @Override
    public List<RepositoryModel> getRepositories(final String organizationName, final int pagesNumber) {
        log.info("[getRepositories] -- get repositories for organizationName: {}", () -> organizationName);
        String url = "https://api.github.com/orgs/" + organizationName + "/repos?per_page=" + pagesNumber;
        RepositoryModel[] repositories = readRepositories(url);
        return Arrays.asList(repositories);
    }

    private RepositoryModel[] readRepositories(final String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, RepositoryModel[].class);
    }

}
