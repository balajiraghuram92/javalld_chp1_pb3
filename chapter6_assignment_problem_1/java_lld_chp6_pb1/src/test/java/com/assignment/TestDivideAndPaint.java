package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestDivideAndPaint {

    @Test
    public void testOutputCorrectness() throws Exception {
        String[][] matrix = {
            {"0", "0", "0", "0"},
            {"0", "0", "0", "0"},
            {"0", "0", "0", "0"},
            {"0", "0", "0", "0"}
        };

        List<String> colors = Arrays.asList("red", "blue", "green", "yellow");

        String[][] expectedOutput = {
            {"red", "red", "blue", "blue"},
            {"red", "red", "blue", "blue"},
            {"green", "green", "yellow", "yellow"},
            {"green", "green", "yellow", "yellow"}
        };

        ImagePainter.divideAndPaint(matrix, colors);

        // Check if the output matrix is painted correctly
        assertArrayEquals(expectedOutput, matrix);
    }
}