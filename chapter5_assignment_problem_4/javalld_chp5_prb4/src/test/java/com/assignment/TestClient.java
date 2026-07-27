package com.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream mockOutput;

    @BeforeEach
    public void setUp() {
        mockOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockOutput));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testAdderOutput() {
        adder adder = new adder();
        adder.run();

        String output = mockOutput.toString().trim();
        assertEquals("I am the Adder class", output);
    }

    @Test
    public void testSubtractorOutput() {
        subtractor subtractor = new subtractor();
        subtractor.run();

        String output = mockOutput.toString().trim();
        assertEquals("I am the Subtractor class", output);
    }

    @Test
    public void testMainOutput() throws InterruptedException {
        client.main(new String[]{});

        String expectedOutput = "I am the main class" + System.lineSeparator() +
                                "I am the Adder class" + System.lineSeparator() +
                                "I am the Subtractor class";

        String output = mockOutput.toString().trim();
        assertEquals(expectedOutput, output);
    }
}