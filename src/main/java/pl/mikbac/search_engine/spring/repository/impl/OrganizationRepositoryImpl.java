package pl.mikbac.search_engine.spring.repository.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import pl.mikbac.search_engine.exception.ApiRateLimitException;
import pl.mikbac.search_engine.model.exte.OrganizationModel;
import pl.mikbac.search_engine.spring.repository.OrganizationRepository;

/**
 * Created by MikBac on 2019
 */

@Log4j2
@Repository
public class OrganizationRepositoryImpl extends AbstractGitHubApiRepository implements OrganizationRepository {

    @Override
    public int getRepositoriesQuantity(final String organizationName) {
        log.info("Get repositories quantity for organizationName: {} ", () -> organizationName);

        final String url = getApiUrl(organizationName, null);
        OrganizationModel organizationModel = null;

        try {
            organizationModel = getGitHubRestTemplate().getForObject(url, OrganizationModel.class);
        } catch (HttpClientErrorException e) {
            throw new ApiRateLimitException();
        }

        return organizationModel != null ? organizationModel.getPublicRepos() : 0;
    }

}
