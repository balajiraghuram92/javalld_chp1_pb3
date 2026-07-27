package com.assignment;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Hello world!
 */
public final class TrainReservationSystem {
    private Map<String, Integer> available_seats;
    private ReentrantLock lck;

    public TrainReservationSystem(Map<String, Integer> initialSeats)
    {
        this.available_seats = initialSeats;
        this.lck = new ReentrantLock();
    }


    public boolean reserveSeats(String seatType, Integer seats)
    {
        lck.lock();
        try{
            if(available_seats.containsKey(seatType) && available_seats.get(seatType) > seats)
            {
                available_seats.merge(seatType, -seats, Integer::sum);
                return true;
            }
            return false;
        }
        finally
        {
            lck.unlock();;
        }
    }

    public int getAvailableSeats(String seatType)
    {
        lck.lock();
        try
        {
            return available_seats.get(seatType);
        }
        finally
        {
            lck.unlock();
        }
    }

}
