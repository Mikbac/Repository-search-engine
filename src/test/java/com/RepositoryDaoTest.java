package com;

import com.dao.RepositoryDao;
import com.model.Repository;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

public class RepositoryDaoTest {

    @Test
    public void getRepositoryWhenUsernameIsAllegro() {

        List<Repository> repositories;
        repositories = RepositoryDao.getRepositories("Allegro");

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenUsernameIsallegro() {

        List<Repository> repositories;
        repositories = RepositoryDao.getRepositories("allegro");

        assertNotNull(repositories);

    }

    @Test
    public void getRepositoryWhenUsernameIsALLEGRO() {

        List<Repository> repositories;
        repositories = RepositoryDao.getRepositories("ALLEGRO");

        assertNotNull(repositories);

    }
}
