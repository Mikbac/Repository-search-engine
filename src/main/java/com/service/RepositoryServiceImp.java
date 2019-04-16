package com.service;

import com.dao.OrganizationDao;
import com.dao.RepositoryDao;
import com.model.Organization;
import com.model.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryServiceImp implements RepositoryService {


    @Override
    public List<Repository> getAllRepositories(String organizationName) {

        int pagesNumber = OrganizationDao.readNumberOfRepositories(organizationName);
        
        return RepositoryDao.getRepositories(organizationName, pagesNumber);
    }


    @Override
    public int getNumberOfRepositories(String organizationName) {

        int pagesNumber = OrganizationDao.readNumberOfRepositories(organizationName);

        return pagesNumber;
    }


    @Override
    public Repository getLastUpdatedRepository(String organizationName) {

        List<Repository> repositories;
        repositories = getAllRepositories(organizationName);

        Repository repository;
        repository = DateSupport.findLatestDate(repositories);

        return repository;
    }
}
