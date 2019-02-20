package com.ibudasov.reflectje.domain;

public class Emotion implements ExperienceScope {
    private String description;

    Emotion(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
