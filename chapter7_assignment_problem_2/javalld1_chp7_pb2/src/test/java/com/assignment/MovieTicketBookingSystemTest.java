package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketBookingSystemTest {

    // Helper method corresponding to Python's book_seats
    public static void bookSeats(MovieTicketBookingSystem bookingSystem, int numSeats) {
        bookingSystem.reserveSeats(numSeats);
    }

    @Test
    public void testReserveSeats() {
        MovieTicketBookingSystem bookingSystem = new MovieTicketBookingSystem(100);
        assertTrue(bookingSystem.reserveSeats(10));  // Booking 10 seats
        assertTrue(bookingSystem.reserveSeats(5));   // Booking 5 more seats
        assertFalse(bookingSystem.reserveSeats(100)); // Attempting to book more seats than available
        assertTrue(bookingSystem.reserveSeats(50));  // Booking remaining available seats
    }

    @Test
    public void testGetAvailableSeats() {
        MovieTicketBookingSystem bookingSystem = new MovieTicketBookingSystem(100);
        assertEquals(100, bookingSystem.getAvailableSeats());  // Initially, all seats are available
        bookingSystem.reserveSeats(10);  // Booking 10 seats
        assertEquals(90, bookingSystem.getAvailableSeats());   // 10 seats are booked, 90 seats available
        bookingSystem.reserveSeats(20);  // Booking 20 more seats
        assertEquals(70, bookingSystem.getAvailableSeats());   // 30 seats are booked, 70 seats available
    }

    @Test
    public void testConcurrentBooking() throws InterruptedException {
        MovieTicketBookingSystem bookingSystem = new MovieTicketBookingSystem(100);
        int numThreads = 10;
        int seatsPerThread = 10;
        Thread[] threads = new Thread[numThreads];

        // Create and start multiple threads for concurrent booking
        for (int i = 0; i < numThreads; i++) {
            Thread thread = new Thread(() -> bookSeats(bookingSystem, seatsPerThread));
            threads[i] = thread;
            thread.start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Check if total booked seats do not exceed total available seats
        int totalBookedSeats = 100 - bookingSystem.getAvailableSeats();
        assertTrue(totalBookedSeats <= 100);
    }
}