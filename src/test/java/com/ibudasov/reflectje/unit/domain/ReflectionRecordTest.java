package com.ibudasov.reflectje.unit.domain;

import com.ibudasov.reflectje.domain.ReflectionRecord;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

public class ReflectionRecordTest {

    @Test
    public void whenTryingToCreateRecordFromStrings_themRecordIsCreated() {
        String expectedFact = "Created the very basic ReflectionRecord class in the system";
        String expectedThought = "The reflectionRecord object will be a root object for smaller ones like thought, emotion, fact";
        String expectedEmotion = "Satisfaction";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate expectedDate = LocalDate.now();

        ReflectionRecord reflectionRecord = ReflectionRecord.createFromStrings(expectedFact, expectedThought, expectedEmotion);

        assertThat(reflectionRecord.getFact().getDescription()).isEqualTo(expectedFact);
        assertThat(reflectionRecord.getThought().getDescription()).isEqualTo(expectedThought);
        assertThat(reflectionRecord.getEmotion().getDescription()).isEqualTo(expectedEmotion);
        assertThat(expectedDate.format(dateFormat)).isEqualTo(reflectionRecord.getDate().format(dateFormat));
    }
}