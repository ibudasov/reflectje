package com.ibudasov.reflectje.domain;

public class Thought implements ExperienceScope {
    private String description;

    Thought(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
