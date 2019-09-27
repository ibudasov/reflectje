package com.ibudasov.reflectje.infrastructure;

import com.ibudasov.reflectje.domain.Id;

import java.util.UUID;

public class Uuid implements Id {

    private String id;

    private Uuid(String id) {
        this.id = id;
    }

    public static Id generate() {
        return createFrom(UUID.randomUUID().toString());
    }

    public static Id createFrom(String someValue) {
        return new Uuid(someValue);
    }

    public String toString() {
        return this.id;
    }
}
