package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class TrainReservationSystemTest {

    // Helper method corresponding to Python's book_seats method
    public void bookSeats(TrainReservationSystem reservationSystem, String seatType, int numSeats) {
        reservationSystem.reserveSeats(seatType, numSeats);
    }

    @Test
    public void testConcurrentBooking() throws InterruptedException {
        Map<String, Integer> initialSeats = new HashMap<>();
        initialSeats.put("1AC", 50);
        initialSeats.put("2AC", 100);
        initialSeats.put("3AC", 150);
        initialSeats.put("Sleeper", 200);

        TrainReservationSystem reservationSystem = new TrainReservationSystem(initialSeats);
        int numThreads = 5;
        int seatsPerThread = 5;
        
        // Total threads: 5 for 1AC + 5 for 2AC + 5 for 3AC = 15 threads
        Thread[] threads = new Thread[15];
        int index = 0;

        // Create and start multiple threads for concurrent booking (1AC)
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> bookSeats(reservationSystem, "1AC", seatsPerThread));
            threads[index++] = thread;
            thread.start();
        }

        // Create and start multiple threads for concurrent booking (2AC)
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> bookSeats(reservationSystem, "2AC", 2 * seatsPerThread));
            threads[index++] = thread;
            thread.start();
        }

        // Create and start multiple threads for concurrent booking (3AC)
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> bookSeats(reservationSystem, "3AC", 7 * seatsPerThread));
            threads[index++] = thread;
            thread.start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Check total booked seats and remaining available seats
        int totalBooked1AC = 50 - reservationSystem.getAvailableSeats("1AC");
        assertEquals(25, totalBooked1AC);

        int totalBooked2AC = 100 - reservationSystem.getAvailableSeats("2AC");
        assertEquals(50, totalBooked2AC);

        assertEquals(10, reservationSystem.getAvailableSeats("3AC"));
    }
}