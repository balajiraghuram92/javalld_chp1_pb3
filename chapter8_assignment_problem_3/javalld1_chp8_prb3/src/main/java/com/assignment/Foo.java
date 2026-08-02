package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public final class Foo {
    private Semaphore sem1;
    private Semaphore sem2;
    private Semaphore sem3;

    private List<String> output = Collections.synchronizedList(new ArrayList<>());

    public Foo()
    {
        sem1 = new Semaphore(1);
        sem2 = new Semaphore(0);
        sem3 = new Semaphore(0);
    }

    public void first() throws InterruptedException {
        sem1.acquire();
        output.add("first");
        sem2.release();
    }

    public void second() throws InterruptedException{
        sem2.acquire();
        output.add("second");
        sem3.release();
    }

    public void third() throws InterruptedException{
        sem3.acquire();
        output.add("third");
    }

    public List<String> getOutput()
    {
        return output;
    }
}
