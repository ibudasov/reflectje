package com.ibudasov.reflectje.application.request;

import java.util.List;

public class CreateRecordRequest {
    private List<Experience> experiences;

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }
}
