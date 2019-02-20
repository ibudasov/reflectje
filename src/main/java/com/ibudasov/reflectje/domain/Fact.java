package com.ibudasov.reflectje.domain;

public class Fact implements Experience {

    private String description;

    public Fact(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
