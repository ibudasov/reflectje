package com.ibudasov.reflectje.infrastructure.controller;

import com.ibudasov.reflectje.application.response.CreateRecordResponse;
import com.ibudasov.reflectje.infrastructure.Uuid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(path = "/record", produces = APPLICATION_JSON_UTF8_VALUE)
public class RecordController {

    @PostMapping(path = "/")
    @ResponseStatus(value = HttpStatus.OK)
    public CreateRecordResponse createRecord() {

        // take json string with an array
        // parse it as a key-val
        // Uppercase key
        // try to instantiate Experience related to the key
        // if doesn't work - throw
        // if works -- add to accumulator hashmap
        // return it

        CreateRecordResponse createRecordResponse = new CreateRecordResponse();

        return createRecordResponse.setCreatedRecordId(new Uuid("some-uuid"));
    }
}
