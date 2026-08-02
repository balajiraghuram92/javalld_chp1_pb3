package com.assignment;

import java.util.concurrent.Semaphore;

public class FooBar {
    private int n;

    // TODO: Declare your Semaphores here
    private final Semaphore fooSemaphore;
    private final Semaphore barSemaphore;

    public FooBar(int n) {
        this.n = n;
        // TODO: Initialize your Semaphores here
        fooSemaphore = new Semaphore(1); // Allow foo to run first
        barSemaphore = new Semaphore(0); // Block bar until foo has run
    }

    public void foo() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // TODO: Acquire semaphore, print "foo", release bar's semaphore
            fooSemaphore.acquire(); // Acquire foo's semaphore
            System.out.print("foo");
            barSemaphore.release(); // Release bar's semaphore
        }
    }

    public void bar() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // TODO: Acquire semaphore, print "bar", release foo's semaphore
            barSemaphore.acquire(); // Acquire bar's semaphore
            System.out.print("bar");
            fooSemaphore.release(); // Release foo's semaphore
        }
    }
}