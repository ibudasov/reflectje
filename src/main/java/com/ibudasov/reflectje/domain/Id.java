package com.ibudasov.reflectje.domain;

public interface Id {

    /**
     * Id can be auto-generated if needed.
     * For example it's useful right before saving an entity,
     * when you don't really care of returning the Id.
     */
    Id generate();

    /**
     * There must be possibility to assign an Id manually.
     * Example: you create a command for creating an entity.
     * Command will be executed asynchronously, but you still want to return id to frontend.
     */
    Id createFrom(String someValue);

    /**
     * Id can be converted to string in order to save it to database.
     */
    String toString();
}
