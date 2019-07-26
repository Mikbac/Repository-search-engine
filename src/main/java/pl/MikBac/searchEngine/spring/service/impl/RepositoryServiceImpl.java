/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.MikBac.searchEngine.model.Repository;
import pl.MikBac.searchEngine.spring.repository.OrganizationRepository;
import pl.MikBac.searchEngine.spring.repository.RepositoryRepository;
import pl.MikBac.searchEngine.spring.service.RepositoryService;

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

        int pagesNumber = getNumberOfRepositories(organizationName);

        return repositoryRepository.getRepositories(organizationName, pagesNumber);
    }

    @Override
    public int getNumberOfRepositories(String organizationName) {

        int pagesNumber = organizationRepository.readNumberOfRepositories(organizationName);

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
