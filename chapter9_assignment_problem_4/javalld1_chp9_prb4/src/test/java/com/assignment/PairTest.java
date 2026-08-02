package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    public void testPairCreation() {
        // Create a pair of integer and string
        Pair<Integer, String> pair1 = new Pair<>(1, "apple");
        assertEquals(1, pair1.getFirst());
        assertEquals("apple", pair1.getSecond());

        // Create a pair of double and list
        Pair<Double, List<Integer>> pair2 = new Pair<>(3.14, List.of(1, 2, 3));
        assertEquals(3.14, pair2.getFirst());
        assertEquals(List.of(1, 2, 3), pair2.getSecond());

        // Create a pair of list (as tuple equivalent) and map (as dict equivalent)
        Pair<List<Integer>, Map<String, Integer>> pair3 = new Pair<>(
                List.of(1, 2),
                Map.of("a", 1, "b", 2)
        );
        assertEquals(List.of(1, 2), pair3.getFirst());
        assertEquals(Map.of("a", 1, "b", 2), pair3.getSecond());
    }

    @Test
    public void testPairRepresentation() {
        // Create a pair of integer and string
        Pair<Integer, String> pair1 = new Pair<>(1, "apple");
        assertEquals("Pair(1, apple)", pair1.toString());

        // Create a pair of double and list
        Pair<Double, List<Integer>> pair2 = new Pair<>(3.14, List.of(1, 2, 3));
        assertEquals("Pair(3.14, [1, 2, 3])", pair2.toString());

        // Create a pair of list and map
        Pair<List<Integer>, Map<String, Integer>> pair3 = new Pair<>(
                List.of(1, 2),
                Map.of("a", 1, "b", 2)
        );
        // Note: Java Map.toString() formats entries as {key=value}
        assertEquals("Pair([1, 2], {a=1, b=2})", pair3.toString());
    }
}