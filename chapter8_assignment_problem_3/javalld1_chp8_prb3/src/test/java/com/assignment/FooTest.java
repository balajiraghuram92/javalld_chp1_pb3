package com.assignment;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {

    @Test
    public void testSequence() throws InterruptedException {
        Foo foo = new Foo();

        // Create threads for calling first(), second(), and third()
        Thread threadFirst = new Thread(() -> {
            try {
                foo.first();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadSecond = new Thread(() -> {
            try {
                foo.second();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread threadThird = new Thread(() -> {
            try {
                foo.third();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Start threads in reverse order (third(), second(), first())
        threadThird.start();
        threadSecond.start();
        threadFirst.start();

        // Wait for all threads to complete
        threadFirst.join();
        threadSecond.join();
        threadThird.join();

        // Verify the output sequence
        List<String> expected = List.of("first", "second", "third");
        assertEquals(expected, foo.getOutput());
    }
}