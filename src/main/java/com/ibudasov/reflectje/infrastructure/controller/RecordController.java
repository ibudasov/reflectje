package com.ibudasov.reflectje.infrastructure.controller;

import com.ibudasov.reflectje.application.request.CreateRecordRequest;
import com.ibudasov.reflectje.application.request.RequestedExperience;
import com.ibudasov.reflectje.application.response.CreateRecordResponse;
import com.ibudasov.reflectje.infrastructure.Uuid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(path = "/record", produces = APPLICATION_JSON_UTF8_VALUE)
public class RecordController {

    @PostMapping(path = "/")
    @ResponseStatus(value = HttpStatus.OK)
    public CreateRecordResponse createRecord(@RequestBody CreateRecordRequest request) {

        StringBuilder response = new StringBuilder();
        response.append("|");
        for (RequestedExperience requestedExperience : request.getExperiences()) {
            response
                    .append(requestedExperience.getType())
                    .append('|')
            ;
        }

        CreateRecordResponse createRecordResponse = new CreateRecordResponse();

        return createRecordResponse.setCreatedRecordId(new Uuid(response.toString()));
    }
}
