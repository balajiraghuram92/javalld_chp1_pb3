package com.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTableCreator {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream mockOutput;

    @BeforeEach
    public void setUpStream() {
        mockOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockOutput));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
    }

    private String generateExpectedOutput(int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(number)
              .append(" times ")
              .append(i)
              .append(" is ")
              .append(number * i)
              .append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Test
    public void testTableCreationFor3() {
        TableCreator tableCreator = new TableCreator(3);
        tableCreator.run();
        assertEquals(generateExpectedOutput(3), mockOutput.toString());
    }

    @Test
    public void testTableCreationForLargeNumber() {
        int number = 20;
        TableCreator tableCreator = new TableCreator(number);
        tableCreator.run();
        assertEquals(generateExpectedOutput(number), mockOutput.toString());
    }

    @Test
    public void testTableCreationFor1() {
        TableCreator tableCreator = new TableCreator(1);
        tableCreator.run();
        assertEquals(generateExpectedOutput(1), mockOutput.toString());
    }

    @Test
    public void testTableCreationFor0() {
        TableCreator tableCreator = new TableCreator(0);
        tableCreator.run();
        assertEquals(generateExpectedOutput(0), mockOutput.toString());
    }

    @Test
    public void testTableCreationForNegativeNumber() {
        int number = -3;
        TableCreator tableCreator = new TableCreator(number);
        tableCreator.run();
        assertEquals(generateExpectedOutput(number), mockOutput.toString());
    }
}