package com.service;

import com.repository.OrganizationRepository;
import com.repository.RepositoryRepository;
import com.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    private OrganizationRepository organizationRepository;
    private RepositoryRepository repositoryRepository;

    @Autowired
    public RepositoryServiceImpl(OrganizationRepository organizationRepository, RepositoryRepository repositoryRepository) {
        this.organizationRepository = organizationRepository;
        this.repositoryRepository = repositoryRepository;
    }


    @Override
    public List<Repository> getAllRepositories(String organizationName) {

        int pagesNumber = OrganizationRepository.readNumberOfRepositories(organizationName);

        return RepositoryRepository.getRepositories(organizationName, pagesNumber);
    }


    @Override
    public int getNumberOfRepositories(String organizationName) {

        int pagesNumber = OrganizationRepository.readNumberOfRepositories(organizationName);

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
