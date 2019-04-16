package com.service;

import com.model.Repository;

import java.util.List;

public interface RepositoryService {

    List<Repository> getAllRepositories(String organizationName) throws Exception;

    int getNumberOfRepositories(String organizationName);

    Repository getLastUpdatedRepository(String organizationName) throws Exception;
}
