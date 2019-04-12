package com;

import com.model.Repository;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RepositoryDataTest {

    @Test
    public void getRepositoryWhenUsernameIsAllegro() throws Exception {

        Repository repository;
        repository = RepositoryData.getRepository("Allegro");

        assertNotNull(repository);

    }

    @Test
    public void getRepositoryWhenUsernameIsallegro() throws Exception {

        Repository repository;
        repository = RepositoryData.getRepository("allegro");

        assertNotNull(repository);

    }

    @Test
    public void getRepositoryWhenUsernameIsALLEGRO() throws Exception {

        Repository repository;
        repository = RepositoryData.getRepository("ALLEGRO");

        assertNotNull(repository);

    }
}
