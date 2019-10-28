package com.ibudasov.reflectje.domain;

public interface Id {
    /**
     * Id can be converted to string in order to save it to database.
     */
    String toString();

    /**
     * There supposed to be a possibility to generate ID
     */
    Id generate();

    /**
     * Also the possibility to specify the value of ID needed
     */
    Id createFrom(String value);
}
