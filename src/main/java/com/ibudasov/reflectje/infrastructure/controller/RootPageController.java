package com.ibudasov.reflectje.infrastructure.controller;

import com.ibudasov.reflectje.application.response.RootPageResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(path = "/", produces = APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
public class RootPageController {

    @GetMapping(path = "/")
    public RootPageResponse rootPage() {

        // take json string with an array
        // parse it as a key-val
        // Uppercase key
        // try to instantiate Experience related to the key
        // if doesn't work - throw
        // if works -- add to accumulator hashmap
        // return it

        RootPageResponse rootPageResponse = new RootPageResponse();

        return rootPageResponse.setGreeting("Hoi alemaal!");
    }
}
