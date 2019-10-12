package com.ibudasov.reflectje.application.request;

public class RequestedExperience {
    private String type;
    private String description;

    public RequestedExperience(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
