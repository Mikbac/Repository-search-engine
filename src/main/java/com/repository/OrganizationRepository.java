package com.repository;

import com.model.Organization;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

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
