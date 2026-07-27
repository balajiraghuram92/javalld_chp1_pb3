package com.assignment;

/**
 * Hello world!
 */
public final class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    } 

    public synchronized void incValue(int val)
    {
        this.count += val;
    }

    public synchronized void decValue(int val)
    {
        this.count -= val;
    }

    public synchronized int getValue()
    {
        return this.count;
    }
}
