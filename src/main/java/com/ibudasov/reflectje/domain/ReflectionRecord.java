package com.ibudasov.reflectje.domain;

import java.time.LocalDate;

public class ReflectionRecord {

    private LocalDate date;

    private Fact fact;

    private Thought thought;

    private Emotion emotion;

    public ReflectionRecord(Fact fact, Thought thought, Emotion emotion) {
        this.fact = fact;
        this.thought = thought;
        this.emotion = emotion;

        this.date = LocalDate.now();
    }

    public static ReflectionRecord createFromStrings(String fact, String thought, String emotion) {
        return new ReflectionRecord(new Fact(fact), new Thought(thought), new Emotion(emotion));
    }

    public LocalDate getDate() {
        return date;
    }

    public Fact getFact() {
        return fact;
    }

    public Thought getThought() {
        return thought;
    }

    public Emotion getEmotion() {
        return emotion;
    }
}
