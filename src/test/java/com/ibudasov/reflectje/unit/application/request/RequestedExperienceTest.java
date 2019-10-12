package com.ibudasov.reflectje.unit.application.request;

import com.ibudasov.reflectje.application.request.RequestedExperience;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RequestedExperienceTest {
    @Test
    public void whenRequestedExperienceCreated_thenDataCanBeRetrieved() {

        RequestedExperience expectedFact = new RequestedExperience("fact", "Chuck norris counted till infinity. Twice.");

        assertThat(expectedFact.getType().contains("fact")).isTrue();
        assertThat(expectedFact.getDescription().contains("Chuck norris counted till infinity. Twice.")).isTrue();
    }

}