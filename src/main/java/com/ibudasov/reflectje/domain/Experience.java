package com.ibudasov.reflectje.domain;

/**
 * The central piece of the application.
 * Experience might be: a dream, a fact, a feeling, an emotion.
 * Basically, anything what can influence the patients emotional consciousness.
 */
public interface Experience {

    // todo: maybe I should make it an abstract class? But I don't see any advantage so far
    // todo: what about moving getters ans setters here, at least?

    String getDescription();
}
