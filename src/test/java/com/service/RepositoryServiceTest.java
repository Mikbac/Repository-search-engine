package com.service;

import com.model.Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@WebMvcTest
public class RepositoryServiceTest {

    @MockBean
    RepositoryService repositoryService;

    @Test
    public void getAllRepositoriesWhenUsernameIsAllegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("Allegro"));
    }

    @Test
    public void getAllRepositoriesWhenUsernameIsallegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("allegro"));
    }

    @Test
    public void getAllRepositoriesWhenUsernameIsALLEGRO() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("ALLEGRO"));
    }


}
