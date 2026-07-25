package com.assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        // Matches Scaler test setup parameters: ("1234567890", 1000, 5)
        account = new BankAccount("1234567890", 1000, 5.0);
    }

    @Test
    public void testGetSimpleInterest() {
        // Test for 1 year -> Expected: 50.0
        assertEquals(50.0, account.getSimpleInterest(1), 0.0001);
        
        // Test for 2 years -> Expected: 100.0
        assertEquals(100.0, account.getSimpleInterest(2), 0.0001);
    }

    @Test
    public void testGetBalanceWithInterest() {
        // Test for 1 year -> Expected: 1050.0
        assertEquals(1050.0, account.getBalanceWithInterest(1), 0.0001);
        
        // Test for 2 years -> Expected: 1100.0
        assertEquals(1100.0, account.getBalanceWithInterest(2), 0.0001);
    }
}