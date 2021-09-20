package pl.mikbac.search_engine.spring.repository.impl;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import pl.mikbac.search_engine.spring.property.GithubProperties;

import javax.annotation.Resource;

/**
 * Created by MikBac on 20.09.2021
 */

public abstract class AbstractGitHubApiRepository {

    @Resource
    private RestTemplateBuilder restTemplateBuilder;

    @Resource
    protected GithubProperties githubProperties;

    protected RestTemplate getGitHubRestTemplate() {
        return restTemplateBuilder.basicAuthentication(githubProperties.getUsername(), githubProperties.getToken()).build();
    }

}
