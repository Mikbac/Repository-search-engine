package com.dao;

import com.model.Organization;
import com.model.Repository;

import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class RepositoryDao {


    public static List<Repository> getRepositories(String username) {

        String url;
        Repository[] repositories;
        int pagesNumber;
        pagesNumber = readNumberOfRepositories(username);

        url = "https://api.github.com/orgs/" + username + "/repos?per_page=" + pagesNumber;
        repositories = readRepositories(url);

        return Arrays.asList(repositories);
    }


    private static Repository[] readRepositories(String url) {
        RestTemplate restTemplate = new RestTemplate();
        Repository[] repositories = restTemplate.getForObject(url, Repository[].class);

        return repositories;
    }


    private static int readNumberOfRepositories(String username) {
        RestTemplate restTemplate = new RestTemplate();
        String url;
        url = "https://api.github.com/orgs/" + username;

        Organization organization = restTemplate.getForObject(url, Organization.class);

        return organization.getNumberOfRepositories();
    }
}
