package com.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    private ByteArrayOutputStream mockOutput;

    @BeforeEach
    public void setUpStreams() {
        mockOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockOutput));
    }

    @AfterEach
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    public void testMain() throws Exception {
        String inputData = "5\n7\n";
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        Client.main(new String[]{});

        String expectedOutput = "12" + System.lineSeparator();
        assertEquals(expectedOutput, mockOutput.toString());
    }
}