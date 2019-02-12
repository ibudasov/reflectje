package com.ibudasov.reflectje.web.controller;

import com.ibudasov.reflectje.web.response.DefaultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(path = "/", produces = APPLICATION_JSON_UTF8_VALUE)
public class DefaultController {

    @GetMapping(path = "/")
    public DefaultResponse rootPage() {

        DefaultResponse defaultResponse = new DefaultResponse();

        return defaultResponse.setGreeting("Hoi alemaal!");
    }
}
