package com.ibudasov.reflectje.domain;

public class Fact implements ExperienceScope {

    private String description;

    Fact(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
