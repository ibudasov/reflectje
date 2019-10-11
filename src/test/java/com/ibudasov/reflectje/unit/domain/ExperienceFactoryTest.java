package com.ibudasov.reflectje.unit.domain;

import com.ibudasov.reflectje.domain.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ExperienceFactoryTest {

    @Test
    public void whenTryingToCreateFact_thenItIsCreated() {
        ExperienceFactory factory = new ExperienceFactory();

        Experience experienceFromLiteralAndDescription = null;
        try {
            experienceFromLiteralAndDescription = factory
                    .createExperienceFromLiteralAndDescription("fact", "something happened");
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertThat(experienceFromLiteralAndDescription)
                .isEqualToComparingFieldByField(new Fact("something happened"));
    }

    @Test
    public void whenTryingToCreateThought_thenItIsCreated() {
        ExperienceFactory factory = new ExperienceFactory();

        Experience experienceFromLiteralAndDescription = null;
        try {
            experienceFromLiteralAndDescription = factory
                    .createExperienceFromLiteralAndDescription("thought", "this looks good");
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertThat(experienceFromLiteralAndDescription)
                .isEqualToComparingFieldByField(new Thought("this looks good"));
    }

    @Test
    public void whenTryingToCreateEmotion_thenItIsCreated() {
        ExperienceFactory factory = new ExperienceFactory();

        Experience experienceFromLiteralAndDescription = null;
        try {
            experienceFromLiteralAndDescription = factory
                    .createExperienceFromLiteralAndDescription("emotion", "happiness");
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertThat(experienceFromLiteralAndDescription)
                .isEqualToComparingFieldByField(new Emotion("happiness"));
    }

    @Test
    public void whenTryingToCreateUnknownExperience_thenExceptionIsThrown() {
        assertThatThrownBy(
                () -> (new ExperienceFactory()).createExperienceFromLiteralAndDescription("dream", "had a dream about new camera"))
                .isInstanceOf(Exception.class)
                .hasMessageContaining("dream is not supported yet");
    }
}