package com.ibudasov.reflectje.unit.domain;

import com.ibudasov.reflectje.domain.Record;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordTest {

    @Test
    public void whenTryingToCreateRecordFromStrings_themRecordIsCreated() {
        String expectedFact = "Created the very basic Record class in the system";
        String expectedThought = "The record object will be a root object for smaller ones like thought, emotion, fact";
        String expectedEmotion = "Satisfaction";

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate expectedDate = LocalDate.now();

        Record record = Record.createFromStrings(expectedFact, expectedThought, expectedEmotion);

        assertThat(record.getFact().getDescription()).isEqualTo(expectedFact);
        assertThat(record.getThought().getDescription()).isEqualTo(expectedThought);
        assertThat(record.getEmotion().getDescription()).isEqualTo(expectedEmotion);
        assertThat(expectedDate.format(dateFormat)).isEqualTo(record.getDate().format(dateFormat));
    }
}