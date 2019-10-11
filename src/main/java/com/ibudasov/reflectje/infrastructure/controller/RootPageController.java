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
        RootPageResponse rootPageResponse = new RootPageResponse();

        return rootPageResponse.setGreeting("Hoi alemaal!");
    }
}
