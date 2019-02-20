package com.ibudasov.reflectje.domain;

public class Thought implements Experience {
    private String description;

    public Thought(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
