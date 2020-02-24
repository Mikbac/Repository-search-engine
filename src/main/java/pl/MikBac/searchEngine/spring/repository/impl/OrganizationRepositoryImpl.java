package pl.MikBac.searchEngine.spring.repository.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.MikBac.searchEngine.model.exte.OrganizationModel;
import pl.MikBac.searchEngine.spring.repository.OrganizationRepository;

/**
 * Created by MikBac on 2019
 */

@Log4j2
@Repository
public class OrganizationRepositoryImpl implements OrganizationRepository {

    @Override
    public int getRepositoriesQuantity(final String organizationName) {
        log.info("[getRepositoriesQuantity] -- get repositories quantity for organizationName: {} ", () -> organizationName);
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.github.com/orgs/" + organizationName;
        OrganizationModel organizationModel = restTemplate.getForObject(url, OrganizationModel.class);
        return organizationModel.getPublicRepos();
    }

}
