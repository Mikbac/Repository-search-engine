package com.repository;

import com.model.Repository;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RepositoryRepositoryTest {

    private RepositoryRepository repositoryRepository;


    @Before
    public void init() {
        repositoryRepository = new RepositoryRepository();
    }


    @Test
    public void getRepositoryWhenOrganizationNameIsAllegro() {

        List<Repository> repositories;
        repositories = repositoryRepository.getRepositories("Allegro", 1);

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenOrganizationNameIsallegro() {

        List<Repository> repositories;
        repositories = repositoryRepository.getRepositories("allegro", 100);

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenOrganizationNameIsALLEGRO() {

        List<Repository> repositories;
        repositories = repositoryRepository.getRepositories("ALLEGRO", 15);

        assertNotNull(repositories);

    }
}
