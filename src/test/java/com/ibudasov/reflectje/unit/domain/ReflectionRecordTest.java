package com.ibudasov.reflectje.unit.domain;

import com.ibudasov.reflectje.domain.*;
import com.ibudasov.reflectje.infrastructure.Uuid;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ReflectionRecordTest {

    /**
     * todo: unit tests should test tiniest methods.
     * test add,
     * test new,
     * test ...
     * Use more mocks. Everything except SUT should be a mock
     * If it's done like this - you're running the app, but not doing testing test.
     */

    @Test
    public void whenTryingToCreateReflectionRecord_thenRecordIsCreated() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate expectedDate = LocalDate.now();

        ArrayList<Experience> experiences = new ArrayList<>();

        String factDescription = "Created the very basic ReflectionRecord class in the system";
        Fact fact = new Fact(factDescription);
        experiences.add(fact);

        String thoughtDescription = "The reflectionRecord object will be a root object for smaller ones like thought, emotion, fact";
        Thought thought = new Thought(thoughtDescription);
        experiences.add(thought);

        String emotionDescription = "Satisfaction";
        Emotion emotion = new Emotion(emotionDescription);
        experiences.add(emotion);

        ReflectionRecord reflectionRecord = new ReflectionRecord(new Uuid(), experiences);

        assertThat(reflectionRecord.getExperiences()).isEqualTo(experiences);

        assertThat(reflectionRecord.getExperiences().contains(fact)).isTrue();
        assertThat(reflectionRecord.getExperiences().contains(thought)).isTrue();
        assertThat(reflectionRecord.getExperiences().contains(emotion)).isTrue();
        assertThat(reflectionRecord.getId().toString().isEmpty()).isFalse();

        // todo: separate this
        for (Experience experience : reflectionRecord.getExperiences()) {
            if (experience instanceof Fact) {
                assertThat(experience.getDescription()).isEqualTo(factDescription);
            }
            if (experience instanceof Thought) {
                assertThat(experience.getDescription()).isEqualTo(thoughtDescription);
            }
            if (experience instanceof Emotion) {
                assertThat(experience.getDescription()).isEqualTo(emotionDescription);
            }
        }

        assertThat(expectedDate.format(dateFormat)).isEqualTo(reflectionRecord.getDate().format(dateFormat));
    }
}