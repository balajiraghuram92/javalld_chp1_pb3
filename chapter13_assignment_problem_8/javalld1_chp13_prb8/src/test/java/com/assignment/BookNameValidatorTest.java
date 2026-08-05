package com.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BookNameValidatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testValidBookName() {
        String bookName = "Introduction to Scaler Java";
        
        InvalidBookNameException exception = assertThrows(InvalidBookNameException.class, () -> {
            BookNameValidator.validate(bookName);
        });
        
        assertEquals("Book name doesn't start with Scaler Java", exception.getMessage());
    }

    @Test
    public void testInvalidBookName() throws InvalidBookNameException {
        String bookName = "Scaler Java: Introduction to Algorithms";
        String expectedOutput = "Book created!: " + bookName;
        
        BookNameValidator.validate(bookName);
        
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}