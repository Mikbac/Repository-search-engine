package com.repository;

import com.model.Repository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RepositoryRepositoryTest {

    @Test
    public void getRepositoryWhenOrganizationNameIsAllegro() {

        List<Repository> repositories;
        repositories = RepositoryRepository.getRepositories("Allegro", 1);

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenOrganizationNameIsallegro() {

        List<Repository> repositories;
        repositories = RepositoryRepository.getRepositories("allegro", 100);

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenOrganizationNameIsALLEGRO() {

        List<Repository> repositories;
        repositories = RepositoryRepository.getRepositories("ALLEGRO", 15);

        assertNotNull(repositories);

    }
}
