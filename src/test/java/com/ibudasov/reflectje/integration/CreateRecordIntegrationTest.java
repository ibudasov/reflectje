package com.ibudasov.reflectje.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibudasov.reflectje.application.response.CreateRecordResponse;
import com.ibudasov.reflectje.infrastructure.controller.RecordController;
import com.ibudasov.reflectje.unit.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RecordController.class)
@Import(TestConfig.class)
public class CreateRecordIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void IdOfCreatedRecordIsReturnedWhenRecordIsCreated() throws Exception {

        MvcResult result = mvc
                .perform(
                        post("/record/")
                                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                                .content("{\"experiences\": [" +
                                        "{\"type\": \"fact\", \"description\": \"I am writing Java code\"}," +
                                        "{\"type\": \"thought\", \"description\": \"This is quite cool\"}," +
                                        "{\"type\": \"emotion\", \"description\": \"joy\"}" +
                                        "]}")
                )
                .andExpect(status().isOk())
                .andReturn();

        CreateRecordResponse response = new ObjectMapper()
                .readValue(
                        result.getResponse().getContentAsString(),
                        CreateRecordResponse.class
                );

        assertThat(response.getCreatedRecordId()).isEqualTo("|fact|thought|emotion|");
    }
}
