package com.assignment;

public class client {
    
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("I am the main class");
        adder ad = new adder();
        subtractor sb = new subtractor();

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(sb);

        t1.run();
        t2.run();

        t1.join();
        t2.join();
    }
}
