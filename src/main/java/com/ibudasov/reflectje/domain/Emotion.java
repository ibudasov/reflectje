package com.ibudasov.reflectje.domain;

public class Emotion implements Experience {
    private String description;

    public Emotion(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
