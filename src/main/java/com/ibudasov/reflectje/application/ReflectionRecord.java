package com.ibudasov.reflectje.application;

import com.ibudasov.reflectje.domain.Experience;
import com.ibudasov.reflectje.domain.Id;

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

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public LocalDate getDate() {
        return date;
    }
}
