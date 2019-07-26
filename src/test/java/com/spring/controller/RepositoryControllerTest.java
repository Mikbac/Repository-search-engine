/**
 * Created by MikBac on 2019
 */

package com.spring.controller;

import pl.MikBac.searchEngine.spring.controller.RepositoryController;
import pl.MikBac.searchEngine.spring.service.RepositoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(RepositoryController.class)
public class RepositoryControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RepositoryService repositoryService;

    @Test
    public void getRepositoryWhenOrganizationNameIsAllegro() throws Exception {

        this.mockMvc.perform(get("/organization/Allegro/last-modified-repository").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void getRepositoryWhenOrganizationNameIsallegro() throws Exception {

        this.mockMvc.perform(get("/organization/allegro/last-modified-repository").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    public void getRepositoryWhenOrganizationNameIsALLEGRO() throws Exception {

        this.mockMvc.perform(get("/organization/ALLEGRO/last-modified-repository").contentType(APPLICATION_JSON))
                .andExpect(status().isOk());

    }


}
