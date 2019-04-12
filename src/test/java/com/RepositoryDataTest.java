package com;

import com.model.Repository;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RepositoryDataTest {

    @Test
    public void getRepositoryWhenUsernameIsMikBac() throws Exception {

        Repository repository;
        repository = RepositoryData.getRepository("MikBac");

        assertNotNull(repository);

    }

    @Test
    public void getRepositoryWhenUsernameIsmikbac() throws Exception {

        Repository repository;
        repository = RepositoryData.getRepository("mikbac");

        assertNotNull(repository);

    }

    @Test
    public void getRepositoryWhenUsernameIsMIKBAC() throws Exception {

        Repository repository;
        repository = RepositoryData.getRepository("MIKBAC");

        assertNotNull(repository);

    }
}
