package com.ibudasov.reflectje.application.request;

import java.util.List;

public class CreateRecordRequest {
    private List<RequestedExperience> experiences;

    public List<RequestedExperience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<RequestedExperience> experiences) {
        this.experiences = experiences;
    }
}
