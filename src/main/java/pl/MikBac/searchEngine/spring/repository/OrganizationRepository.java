/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import pl.MikBac.searchEngine.model.Organization;

@Repository
public class OrganizationRepository {

    public int readNumberOfRepositories(String organizationName) {
        RestTemplate restTemplate = new RestTemplate();
        String url;
        url = "https://api.github.com/orgs/" + organizationName;

        Organization organization = restTemplate.getForObject(url, Organization.class);

        return organization.getNumberOfRepositories();
    }

}
