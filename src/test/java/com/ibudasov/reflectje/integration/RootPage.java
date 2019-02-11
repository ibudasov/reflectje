package com.ibudasov.reflectje.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibudasov.reflectje.unit.TestConfig;
import com.ibudasov.reflectje.web.response.DefaultResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RootPage.class)
@Import(TestConfig.class)
public class RootPage {

    @Autowired
    private MockMvc mvc;

    @Test
    public void greetingsIsShownWhenMainPageIsAccessed() throws Exception {

        MvcResult result = mvc.perform(
                get("/qw/er")
        )
                .andExpect(status().isOk())
                .andReturn();

        DefaultResponse response = new ObjectMapper()
                .readValue(result.getResponse().getContentAsString(), DefaultResponse.class);

        assertThat(response.getGreeting()).isEqualTo("Hoi alemaal!");
    }
}
