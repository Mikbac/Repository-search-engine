package com.dao;

import com.model.Repository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RepositoryDaoTest {

    @Test
    public void getRepositoryWhenUsernameIsAllegro() {

        List<Repository> repositories;
        repositories = RepositoryDao.getRepositories("Allegro", 1);

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenUsernameIsallegro() {

        List<Repository> repositories;
        repositories = RepositoryDao.getRepositories("allegro", 100);

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenUsernameIsALLEGRO() {

        List<Repository> repositories;
        repositories = RepositoryDao.getRepositories("ALLEGRO", 15);

        assertNotNull(repositories);

    }
}
