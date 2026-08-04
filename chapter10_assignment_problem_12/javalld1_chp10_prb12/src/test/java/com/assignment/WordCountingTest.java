package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountingTest {

    @Test
    public void testWordFrequencies() {
        List<String> sentences = List.of(
            "Python is a popular programming language",
            "I love coding in Python",
            "Java is also a great language"
        );
        Map<String, Integer> expectedResult = Map.ofEntries(
            Map.entry("python", 2),
            Map.entry("is", 2),
            Map.entry("a", 2),
            Map.entry("popular", 1),
            Map.entry("programming", 1),
            Map.entry("language", 2),
            Map.entry("i", 1),
            Map.entry("love", 1),
            Map.entry("coding", 1),
            Map.entry("in", 1),
            Map.entry("java", 1),
            Map.entry("also", 1),
            Map.entry("great", 1)
        );
        assertEquals(expectedResult, WordCounting.wordFrequencies(sentences));
    }

    @Test
    public void testEmptyInput() {
        List<String> sentences = List.of();
        Map<String, Integer> expectedResult = Map.of();
        assertEquals(expectedResult, WordCounting.wordFrequencies(sentences));
    }

    @Test
    public void testCaseInsensitivity() {
        List<String> sentences = List.of(
            "Python is Awesome",
            "python is great",
            "PYTHON is fantastic"
        );
        Map<String, Integer> expectedResult = Map.of(
            "python", 3,
            "is", 3,
            "awesome", 1,
            "great", 1,
            "fantastic", 1
        );
        assertEquals(expectedResult, WordCounting.wordFrequencies(sentences));
    }

    @Test
    public void testPunctuationHandling() {
        List<String> sentences = List.of(
            "Python is, awesome!",
            "Python is great",
            "Python, Python, Python!!!"
        );
        Map<String, Integer> expectedResult = Map.of(
            "python", 5,
            "is", 2,
            "awesome", 1,
            "great", 1
        );
        assertEquals(expectedResult, WordCounting.wordFrequencies(sentences));
    }
}