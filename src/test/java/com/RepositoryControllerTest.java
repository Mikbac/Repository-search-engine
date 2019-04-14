package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest
public class RepositoryControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getRepositoryWhenUsernameIsAllegro() throws Exception {

        this.mockMvc.perform(get("/user/Allegro/repository"))
                .andExpect(status().isOk());

    }

    @Test
    public void getRepositoryWhenUsernameIsallegro() throws Exception {

        this.mockMvc.perform(get("/user/allegro/repository"))
                .andExpect(status().isOk());

    }

    @Test
    public void getRepositoryWhenUsernameIsALLEGRO() throws Exception {

        this.mockMvc.perform(get("/user/ALLEGRO/repository"))
                .andExpect(status().isOk());

    }


}
