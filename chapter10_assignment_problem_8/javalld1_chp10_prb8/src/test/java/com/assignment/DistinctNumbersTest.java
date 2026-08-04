package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctNumbersTest {

    @Test
    public void testGetDistinctNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 4, 5, 5, 6);
        List<Integer> expectedResult = List.of(1, 2, 3, 4, 5, 6);
        
        assertEquals(expectedResult, DistinctNumbers.getDistinctNumbers(numbers));
    }

    @Test
    public void testEmptyList() {
        List<Integer> numbers = List.of();
        
        assertEquals(List.of(), DistinctNumbers.getDistinctNumbers(numbers));
    }

    @Test
    public void testSingleElementList() {
        List<Integer> numbers = List.of(1);
        
        assertEquals(List.of(1), DistinctNumbers.getDistinctNumbers(numbers));
    }

    @Test
    public void testAllDuplicates() {
        List<Integer> numbers = List.of(2, 2, 2, 2);
        
        assertEquals(List.of(2), DistinctNumbers.getDistinctNumbers(numbers));
    }
}