package com.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberDividerTest {

    @Test
    public void testDivideByZero() {
        // When dividing by zero, it should raise a DivisionByZeroException
        assertThrows(DivisionByZeroException.class, () -> {
            NumberDivider.divideNumbers(10, 0);
        });
    }

    @Test
    public void testDivideByNonZero() throws DivisionByZeroException {
        // When dividing by a non-zero number, it should return the result
        double result = NumberDivider.divideNumbers(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    public void testDivideZeroByNonZero() throws DivisionByZeroException {
        // When dividing zero by a non-zero number, it should return zero
        double result = NumberDivider.divideNumbers(0, 5);
        assertEquals(0.0, result);
    }

    @Test
    public void testDivideZeroByZero() {
        // When dividing zero by zero, it should raise a DivisionByZeroException
        assertThrows(DivisionByZeroException.class, () -> {
            NumberDivider.divideNumbers(0, 0);
        });
    }
}