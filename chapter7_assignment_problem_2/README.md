Problem Statement: Movie Ticket Booking (Java Version)

You need to implement a thread-safe MovieTicketBookingSystem class in Java that handles concurrent seat reservations for a movie hall using synchronization/locks.



Requirements (MovieTicketBookingSystem Class)

Instance Variables:



total\_seats (int): Total number of seats in the hall.



available\_seats (int): Number of currently unbooked seats.



A locking mechanism (e.g., ReentrantLock or synchronized) to prevent race conditions.



Constructor (MovieTicketBookingSystem(int totalSeats)):



Initializes total\_seats and available\_seats with the provided value.



Sets up the lock.



reserveSeats(int numSeats) Method:



Thread-safely checks if numSeats can be accommodated.



If available\_seats >= numSeats, decrements available\_seats and returns true. Otherwise, returns false.



getAvailableSeats() Method:



Thread-safely returns the current number of available\_seats.

