package com.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RepositoryServiceTest {

    @MockBean
    RepositoryService repositoryService;

    @Test
    public void getAllRepositoriesWhenOrganizationNameIsAllegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("Allegro"));
    }

    @Test
    public void getAllRepositoriesWhenOrganizationNameIsallegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("allegro"));
    }

    @Test
    public void getAllRepositoriesWhenOrganizationNameIsALLEGRO() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("ALLEGRO"));
    }

    @Test
    public void getNumberOfRepositoriesWhenOrganizationNameIsAllegro(){
        assertNotNull(repositoryService.getNumberOfRepositories("Allegro"));
    }

    @Test
    public void getNumberOfRepositoriesWhenOrganizationNameIsallegro(){
        assertNotNull(repositoryService.getNumberOfRepositories("allegro"));
    }

    @Test
    public void getNumberOfRepositoriesWhenOrganizationNameIsALLEGRO(){
        assertNotNull(repositoryService.getNumberOfRepositories("ALLEGRO"));
    }

}
