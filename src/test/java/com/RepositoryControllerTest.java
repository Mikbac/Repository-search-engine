package com;

import com.controller.RepositoryController;
import org.apache.tomcat.util.http.parser.MediaType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


@RunWith(SpringRunner.class)
@WebMvcTest
public class RepositoryControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getRepositoryWhenUsernameIsMikBac() throws Exception {

        this.mockMvc.perform(get("/user/MikBac/repository"))
                .andExpect(status().isOk());

    }

    @Test
    public void getRepositoryWhenUsernameIsmikbac() throws Exception {

        this.mockMvc.perform(get("/user/mikbac/repository"))
                .andExpect(status().isOk());

    }

    @Test
    public void getRepositoryWhenUsernameIsMIKBAC() throws Exception {

        this.mockMvc.perform(get("/user/MIKBAC/repository"))
                .andExpect(status().isOk());

    }


}
