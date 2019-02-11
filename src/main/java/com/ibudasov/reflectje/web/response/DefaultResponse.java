package com.ibudasov.reflectje.web.response;

public class DefaultResponse {

    private String greeting;

    public DefaultResponse(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
