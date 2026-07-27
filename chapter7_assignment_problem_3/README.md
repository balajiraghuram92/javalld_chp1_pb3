Train Reservation System (Java Version)

You are required to implement a thread-safe TrainReservationSystem class in Java that manages seat availability and reservations across different tier types (1AC, 2AC, 3AC, Sleeper) using locks to prevent race conditions.



Requirements (TrainReservationSystem Class)

Instance Variables:



available\_seats: A map (Map<String, Integer>) tracking the number of available seats for each seat type.



A reentrant locking mechanism (ReentrantLock or ReentrantReadWriteLock) to ensure thread safety.



Constructor (TrainReservationSystem(Map<String, Integer> initialSeats)):



Initializes the available\_seats and the lock.



reserveSeats(String seatType, int numSeats) Method:



Thread-safely checks if the requested seatType exists and has enough unreserved seats.



If available, decreases the count for that seatType and returns true. Otherwise, returns false.



getAvailableSeats(String seatType) Method:



Thread-safely returns the number of remaining available seats for the specified seatType.

