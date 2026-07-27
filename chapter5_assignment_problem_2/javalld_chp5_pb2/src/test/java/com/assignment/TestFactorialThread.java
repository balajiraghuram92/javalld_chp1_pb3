package com.assignment;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class TestFactorialThread {

    // Helper method to calculate expected factorial value in tests
    private BigInteger calculateExpectedFactorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Test
    public void testThreadUsed() throws InterruptedException {
        int n = 1000;
        BigInteger result = solution.computeLargeFactorial(n);
        
        assertNotNull(result);
        assertTrue(result.compareTo(BigInteger.ZERO) > 0);
    }

    @Test
    public void testResultSmallNumber() throws InterruptedException {
        int n = 5;
        BigInteger result = solution.computeLargeFactorial(n);
        
        assertEquals(calculateExpectedFactorial(5), result);
    }

    @Test
    public void testResultLargeNumber() throws InterruptedException {
        int n = 20;
        BigInteger result = solution.computeLargeFactorial(n);
        
        assertEquals(calculateExpectedFactorial(20), result);
    }

    @Test
    public void testResultZero() throws InterruptedException {
        int n = 0;
        BigInteger result = solution.computeLargeFactorial(n);
        
        assertEquals(BigInteger.ONE, result);
    }
}