package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    @Test
    public void testConcurrentCounter() throws InterruptedException {
        // Initialize counter with initial value 0
        Counter counter = new Counter(0);

        // Array to hold all 20 threads (10 increment + 10 decrement)
        Thread[] threads = new Thread[20];
        int index = 0;

        // Create and start multiple threads for concurrent increment and decrement
        for (int i = 0; i < 10; i++) {
            Thread threadInc = new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    counter.incValue(1);
                }
            });

            Thread threadDec = new Thread(() -> {
                for (int j = 0; j < 50000; j++) {
                    counter.decValue(1);
                }
            });

            threads[index++] = threadInc;
            threads[index++] = threadDec;

            threadInc.start();
            threadDec.start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Check if counter value is 500000 after concurrent operations
        assertEquals(500000, counter.getValue());
    }
}