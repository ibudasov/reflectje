package com.ibudasov.reflectje.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReflectionRecord {

    private Id id;

    private LocalDate date;

    private ArrayList<Experience> experiences;

    public ReflectionRecord(Id id, ArrayList<Experience> experiences) {
        this.experiences = experiences;
        this.date = LocalDate.now();
        this.id = id;
    }

    // todo: investigate why and how here can be null
    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public LocalDate getDate() {
        return date;
    }

    public Id getId() {
        return id;
    }
}
