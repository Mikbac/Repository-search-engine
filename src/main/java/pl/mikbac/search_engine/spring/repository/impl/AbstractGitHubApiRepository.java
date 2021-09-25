package pl.mikbac.search_engine.spring.repository.impl;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.mikbac.search_engine.spring.property.GithubProperties;

import javax.annotation.Resource;

/**
 * Created by MikBac on 20.09.2021
 */

public abstract class AbstractGitHubApiRepository {

    @Resource
    protected GithubProperties githubProperties;

    @Resource
    private RestTemplateBuilder restTemplateBuilder;

    protected RestTemplate getGitHubRestTemplate() {
        return restTemplateBuilder.basicAuthentication(githubProperties.getUsername(), githubProperties.getToken()).build();
    }

    protected String getApiUrl(final String additionalPath, final MultiValueMap<String, String> queryParams) {
        return UriComponentsBuilder
                .fromUriString(getGithubApiBaseUrl())
                .path(additionalPath)
                .queryParams(queryParams)
                .build()
                .toUriString();
    }

    private String getGithubApiBaseUrl() {
        return githubProperties.getUrl();
    }
}
