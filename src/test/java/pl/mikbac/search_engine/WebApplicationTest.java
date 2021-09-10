package pl.mikbac.search_engine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.mikbac.search_engine.spring.controller.API.RepositoryController;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by MikBac on 2019
 */

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
