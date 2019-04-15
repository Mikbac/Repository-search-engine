package com.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RepositoryServiceTest {

    @Autowired
    RepositoryService repositoryService;

    @Test
    public void getAllRepositoriesWhenUsernameIsAllegro() throws Exception {
        repositoryService.getAllRepositories("Allegro");
    }

    @Test
    public void getAllRepositoriesWhenUsernameIsallegro() throws Exception {
        repositoryService.getAllRepositories("allegro");
    }

    @Test
    public void getAllRepositoriesWhenUsernameIsALLEGRO() throws Exception {
        repositoryService.getAllRepositories("ALLEGRO");
    }

    @Test
    public void getLastUpdatedRepositoryWhenUsernameIsAllegro() throws Exception {
        repositoryService.getLastUpdatedRepository("Allegro");
    }

    @Test
    public void getLastUpdatedRepositoryWhenUsernameIsallegro() throws Exception {
        repositoryService.getLastUpdatedRepository("allegro");
    }

    @Test
    public void getLastUpdatedRepositoryWhenUsernameIsALLEGRO() throws Exception {
        repositoryService.getLastUpdatedRepository("ALLEGRO");
    }

}
