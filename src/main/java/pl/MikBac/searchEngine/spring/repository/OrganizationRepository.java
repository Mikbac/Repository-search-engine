/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.MikBac.searchEngine.model.OrganizationModel;

@Repository
public class OrganizationRepository {

    public int readNumberOfRepositories(String organizationName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.github.com/orgs/" + organizationName;
        OrganizationModel organizationModel = restTemplate.getForObject(url, OrganizationModel.class);
        return organizationModel.getPublicRepos();
    }

}
