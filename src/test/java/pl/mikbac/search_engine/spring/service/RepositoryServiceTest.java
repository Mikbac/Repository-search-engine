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
    public void get_all_repositories_when_organization_name_is_Allegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("Allegro"));
    }

    @Test
    public void get_all_repositories_when_organization_name_is_allegro() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("allegro"));
    }

    @Test
    public void get_all_repositories_when_organization_name_is_ALLEGRO() throws Exception {
        assertNotNull(repositoryService.getAllRepositories("ALLEGRO"));
    }

}
