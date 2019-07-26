/**
 * Created by MikBac on 2019
 */

package com;

import static org.assertj.core.api.Assertions.assertThat;

import pl.MikBac.searchEngine.spring.controller.RepositoryController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTest {

    @Autowired
    RepositoryController repositoryController;

    @Test
    public void contextLoads(){
        assertThat(repositoryController).isNotNull();
    }

}
