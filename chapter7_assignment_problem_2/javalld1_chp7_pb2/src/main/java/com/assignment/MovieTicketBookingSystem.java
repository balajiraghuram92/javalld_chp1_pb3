package com.assignment;
import java.util.concurrent.locks.ReentrantLock;
/**
 * Hello world!
 */
public final class MovieTicketBookingSystem { 
    private int total_seats;
    private int available_seats;
    private ReentrantLock lck;

    public MovieTicketBookingSystem(int totalSeats)
    {
        this.total_seats = totalSeats;
        this.available_seats = totalSeats;
        this.lck = new ReentrantLock();
    }

    public   boolean reserveSeats(int seats)
    {
        lck.lock();

        try{ 
        if(this.available_seats >= seats)
        {
            this.available_seats -= seats;
            return true;
        }

        return false;
    }
    finally
    {
        lck.unlock();;
    }
}

public   int getAvailableSeats()
{
    lck.lock();
    try{
        return this.available_seats;        
    }
    finally
    {
        lck.unlock();
    }
}


}
