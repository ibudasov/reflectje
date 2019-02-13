package com.ibudasov.reflectje.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibudasov.reflectje.infrastructure.controller.RootPageController;
import com.ibudasov.reflectje.application.response.RootPageResponse;
import com.ibudasov.reflectje.unit.TestConfig;
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
@WebMvcTest(RootPageController.class)
@Import(TestConfig.class)
public class RootPageIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void greetingsIsShownWhenMainPageIsAccessed() throws Exception {

        MvcResult result = mvc
                .perform(
                        get("/")
                )
                .andExpect(status().isOk())
                .andReturn();

        RootPageResponse response = new ObjectMapper()
                .readValue(
                        result.getResponse().getContentAsString(),
                        RootPageResponse.class
                );

        assertThat(response.getGreeting()).isEqualTo("Hoi alemaal!");
    }
}
