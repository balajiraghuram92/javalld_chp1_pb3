package com.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        // Redirect System.out to capture thread output
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        // Restore standard console output
        System.setOut(originalOut);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    public void testFooBarExecution(int n) throws InterruptedException {
        FooBar fooBar = new FooBar(n);

        // Define thread 1 to run foo()
        Thread threadFoo = new Thread(() -> {
            try {
                fooBar.foo();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Define thread 2 to run bar()
        Thread threadBar = new Thread(() -> {
            try {
                fooBar.bar();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start both threads concurrently
        threadFoo.start();
        threadBar.start();

        // Wait for execution to finish
        threadFoo.join();
        threadBar.join();

        // Verify printed output
        String expectedOutput = "foobar".repeat(n);
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}