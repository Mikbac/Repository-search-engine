package com.service;

import com.model.Repository;

import java.util.List;

public interface RepositoryService {

    List<Repository> getAllRepositories(String username) throws Exception;

    Repository getLastUpdatedRepository(String username) throws Exception;
}
