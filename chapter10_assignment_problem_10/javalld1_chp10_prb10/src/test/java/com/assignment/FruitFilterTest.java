package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitFilterTest {

    @Test
    public void testFilterFruitsStartingWithA() {
        List<String> fruits = List.of("apple", "banana", "avocado", "orange", "apricot");
        List<String> expectedResult = List.of("apple", "avocado", "apricot");

        assertEquals(expectedResult, FruitFilter.filterFruitsStartingWithA(fruits));
    }

    @Test
    public void testEmptyList() {
        List<String> fruits = List.of();

        assertEquals(List.of(), FruitFilter.filterFruitsStartingWithA(fruits));
    }

    @Test
    public void testNoFruitsStartingWithA() {
        List<String> fruits = List.of("banana", "orange");

        assertEquals(List.of(), FruitFilter.filterFruitsStartingWithA(fruits));
    }

    @Test
    public void testAllFruitsStartingWithA() {
        List<String> fruits = List.of("apple", "avocado", "apricot");

        assertEquals(fruits, FruitFilter.filterFruitsStartingWithA(fruits));
    }
}