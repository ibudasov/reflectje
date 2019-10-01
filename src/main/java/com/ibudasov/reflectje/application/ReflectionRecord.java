package com.ibudasov.reflectje.application;

import com.ibudasov.reflectje.domain.Experience;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReflectionRecord {

    private LocalDate date;

    private ArrayList<Experience> experiences;

    public ReflectionRecord(ArrayList<Experience> experiences) {
        this.experiences = experiences;

        this.date = LocalDate.now();
    }

    public ArrayList<Experience> getExperiences() {
        return experiences;
    }

    public LocalDate getDate() {
        return date;
    }
}
