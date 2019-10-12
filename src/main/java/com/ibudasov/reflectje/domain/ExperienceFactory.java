package com.ibudasov.reflectje.domain;

public class ExperienceFactory {
    public Experience createExperienceFromLiteralAndDescription(String literal, String description) throws CantCreateExperience {

        if (literal.equals("fact")) {
            return new Fact(description);
        }

        if (literal.equals("thought")) {
            return new Thought(description);
        }

        if (literal.equals("emotion")) {
            return new Emotion(description);
        }

        throw new CantCreateExperience(literal + " is not supported yet");
    }
}
