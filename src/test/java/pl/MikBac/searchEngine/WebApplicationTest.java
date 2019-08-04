/**
 * Created by MikBac on 2019
 */

package pl.MikBac.searchEngine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.MikBac.searchEngine.WebApplication;
import pl.MikBac.searchEngine.spring.controller.RepositoryController;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class WebApplicationTest {

    @Resource
    RepositoryController repositoryController;

    @Test
    public void contextLoads() {
        assertThat(repositoryController).isNotNull();
    }

}
