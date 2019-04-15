package com.service;

import com.dao.RepositoryDao;
import com.model.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryServiceImp implements RepositoryService {


    @Override
    public List<Repository> getAllRepositories(String username) {

        RepositoryDao repositoryDao = null;
        
        return repositoryDao.getRepositories(username);
    }

    @Override
    public Repository getLastUpdatedRepository(String username) {

        List<Repository> repositories;
        repositories = getAllRepositories(username);

        Repository repository;
        repository = DateSupport.findLatestDate(repositories);

        return repository;
    }
}
