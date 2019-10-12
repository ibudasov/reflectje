package com.ibudasov.reflectje.unit.infrastructure;

import com.ibudasov.reflectje.application.request.CreateRecordRequest;
import com.ibudasov.reflectje.application.request.RequestedExperience;
import com.ibudasov.reflectje.domain.CantCreateExperience;
import com.ibudasov.reflectje.domain.Fact;
import com.ibudasov.reflectje.domain.ReflectionRecord;
import com.ibudasov.reflectje.domain.Thought;
import com.ibudasov.reflectje.infrastructure.ReflectionRecordFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ReflectionRecordFactoryTest {

    @Test
    public void whenRequested_thenReflectionRecordIsCreated() {

        List<RequestedExperience> requestedExperiences = new ArrayList<>();

        RequestedExperience expectedFact = new RequestedExperience("fact", "Chuck norris counted till infinity. Twice.");
        requestedExperiences.add(expectedFact);

        RequestedExperience expectedThought = new RequestedExperience("thought", "How the hack is it possible?");
        requestedExperiences.add(expectedThought);

        CreateRecordRequest request = new CreateRecordRequest();
        request.setExperiences(requestedExperiences);

        ReflectionRecordFactory factory = new ReflectionRecordFactory();
        try {
            ReflectionRecord record = factory.createFromCreateRecordRequest(request);
            assertThat(record.getExperiences()).isNotNull();
            assertThat(record.getExperiences().toArray().length).isEqualTo(2);
            assertThat(record.getExperiences().toArray()).hasOnlyElementsOfTypes(Thought.class, Fact.class);
            assertThat(record.getExperiences().get(0).getDescription().contains("Chuck norris counted till infinity. Twice.")).isTrue();
            assertThat(record.getExperiences().get(1).getDescription().contains("How the hack is it possible?")).isTrue();
        } catch (CantCreateExperience cantCreateExperience) {
            cantCreateExperience.printStackTrace();
        }
    }

    @Test
    public void whenRequestedUnsupportedExperience_thenExceptionIsThrown() {

        List<RequestedExperience> requestedExperiences = new ArrayList<>();

        RequestedExperience expectedFact = new RequestedExperience("dream", "Of unicorns");
        requestedExperiences.add(expectedFact);

        CreateRecordRequest request = new CreateRecordRequest();
        request.setExperiences(requestedExperiences);

        assertThatThrownBy(
                () -> (new ReflectionRecordFactory()).createFromCreateRecordRequest(request))
                .isInstanceOf(CantCreateExperience.class)
                .hasMessageContaining("dream is not supported yet");
    }
}