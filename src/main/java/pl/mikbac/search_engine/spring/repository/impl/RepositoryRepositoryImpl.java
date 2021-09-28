package pl.mikbac.search_engine.spring.repository.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import pl.mikbac.search_engine.exception.RepositoryNotFoundException;
import pl.mikbac.search_engine.model.exte.RepositoryModel;
import pl.mikbac.search_engine.spring.repository.RepositoryRepository;

import java.util.Arrays;
import java.util.List;

import static pl.mikbac.search_engine.constants.RequestConstants.Param.PER_PAGE;
import static pl.mikbac.search_engine.constants.RequestConstants.REPOST;

/**
 * Created by MikBac on 2019
 */

@Log4j2
@Repository
public class RepositoryRepositoryImpl extends AbstractGitHubApiRepository implements RepositoryRepository {

    @Override
    public List<RepositoryModel> getRepositories(final String organizationName, final int pagesNumber) {
        log.info("Get repositories for organizationName: {}", () -> organizationName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add(PER_PAGE, String.valueOf(pagesNumber));

        final String url = getApiUrl(organizationName + "/" + REPOST, queryParams);
        final RepositoryModel[] repositories = readRepositories(url);

        if (repositories == null || repositories.length == 0) {
            throw new RepositoryNotFoundException(organizationName);
        }

        return Arrays.asList(repositories);
    }

    private RepositoryModel[] readRepositories(final String url) {
        return getGitHubRestTemplate().getForObject(url, RepositoryModel[].class);
    }

}
