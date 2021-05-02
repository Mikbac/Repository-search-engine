package pl.MikBac.searchEngine.spring.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.MikBac.searchEngine.WebApplication;
import pl.MikBac.searchEngine.spring.facade.RepositoryFacade;

import javax.annotation.Resource;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by MikBac on 2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
@AutoConfigureMockMvc
public class RepositoryRestControllerTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void getRepositoryWhenOrganizationNameIsAllegro() throws Exception {
        this.mockMvc.perform(get("/last-modified-repository?organization=Allegro").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsallegro() throws Exception {
        this.mockMvc.perform(get("/last-modified-repository?organization=allegro").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsALLEGRO() throws Exception {
        this.mockMvc.perform(get("/last-modified-repository?organization=ALLEGRO").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
