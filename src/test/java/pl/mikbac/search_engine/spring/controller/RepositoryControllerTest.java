package pl.mikbac.search_engine.spring.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.mikbac.search_engine.WebApplication;

import javax.annotation.Resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by MikBac on 2019
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
@AutoConfigureMockMvc
public class RepositoryControllerTest {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void getRepositoryWhenOrganizationNameIsAllegro() throws Exception {
        this.mockMvc.perform(get("/repository/last-modified/Allegro")
                        .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON_VALUE));
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsallegro() throws Exception {
        this.mockMvc.perform(get("/repository/last-modified/allegro")
                        .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON_VALUE));
    }

    @Test
    public void getRepositoryWhenOrganizationNameIsALLEGRO() throws Exception {
        this.mockMvc.perform(get("/repository/last-modified/ALLEGRO")
                        .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON_VALUE));
    }

}
