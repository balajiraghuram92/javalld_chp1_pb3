package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleEvenNumbersTest {

    @Test
    public void testFilterAndDoubleEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> expectedResult = List.of(4, 8, 12);

        assertEquals(expectedResult, DoubleEvenNumbers.filterAndDoubleEvenNumbers(numbers));
    }

    @Test
    public void testEmptyList() {
        List<Integer> numbers = List.of();

        assertEquals(List.of(), DoubleEvenNumbers.filterAndDoubleEvenNumbers(numbers));
    }

    @Test
    public void testNoEvenNumbers() {
        List<Integer> numbers = List.of(1, 3, 5);

        assertEquals(List.of(), DoubleEvenNumbers.filterAndDoubleEvenNumbers(numbers));
    }

    @Test
    public void testAllEvenNumbers() {
        List<Integer> numbers = List.of(2, 4, 6, 8);
        List<Integer> expectedResult = List.of(4, 8, 12, 16);

        assertEquals(expectedResult, DoubleEvenNumbers.filterAndDoubleEvenNumbers(numbers));
    }
}