package com.assignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomLinkedListTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        // Redirect System.out to capture output from printList()
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        // Restore System.out back to original console output
        System.setOut(originalOut);
    }

    @Test
    public void testAppend() {
        // Create a linked list of integers
        CustomLinkedList<Integer> llInt = new CustomLinkedList<>();
        llInt.append(1);
        llInt.append(2);
        llInt.append(3);

        // Verify the linked list contains the correct elements
        assertEquals(1, llInt.getHead().getData());
        assertEquals(3, llInt.getTail().getData());

        // Verify the linked list is correctly linked
        assertEquals(2, llInt.getHead().getNext().getData());
        assertNull(llInt.getTail().getNext());
    }

    @Test
    public void testPrintList() {
        // Create a linked list of strings
        CustomLinkedList<String> llStr = new CustomLinkedList<>();
        llStr.append("a");
        llStr.append("b");
        llStr.append("c");

        // Execute method under test
        llStr.printList();

        // Verify the printed output matches the expected output
        String expectedOutput = "a -> b -> c -> None" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}