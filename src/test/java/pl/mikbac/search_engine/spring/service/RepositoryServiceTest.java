package pl.mikbac.search_engine.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.mikbac.search_engine.WebApplication;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

/**
 * Created by MikBac on 2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
@AutoConfigureMockMvc
public class RepositoryServiceTest {

    @Resource
    private RepositoryService repositoryService;

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

}
