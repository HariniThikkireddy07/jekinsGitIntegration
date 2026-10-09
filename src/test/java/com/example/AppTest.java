package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetingIncludesName() {
        assertEquals("Hello, Harini!", App.greeting("Harini"));
    }

    @Test
    void blankNameUsesDefaultGreeting() {
        assertEquals("Hello, DevOps!", App.greeting(" "));
    }
}
