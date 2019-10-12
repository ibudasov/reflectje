package com.ibudasov.reflectje.infrastructure;

import com.ibudasov.reflectje.application.request.CreateRecordRequest;
import com.ibudasov.reflectje.application.request.RequestedExperience;
import com.ibudasov.reflectje.domain.CantCreateExperience;
import com.ibudasov.reflectje.domain.Experience;
import com.ibudasov.reflectje.domain.ExperienceFactory;
import com.ibudasov.reflectje.domain.ReflectionRecord;

import java.util.ArrayList;

public class ReflectionRecordFactory {

    public ReflectionRecord createFromCreateRecordRequest(CreateRecordRequest request) throws CantCreateExperience {

        ExperienceFactory experienceFactory = new ExperienceFactory();
        ArrayList<Experience> requestedExperiences = new ArrayList<>();

        for (RequestedExperience requestedExperience : request.getExperiences()) {
            requestedExperiences.add(
                    experienceFactory.createExperienceFromLiteralAndDescription(
                            requestedExperience.getType(),
                            requestedExperience.getDescription()
                    )
            );
        }

        return new ReflectionRecord(
                new Uuid(),
                requestedExperiences
        );
    }
}
