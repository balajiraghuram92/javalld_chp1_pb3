package com.assignment;

/**
 * Hello world!
 */
public class adder implements Runnable{
    private int num1;
    private int num2;

    public adder(int num1, int num2)
    { 
        this.num1 = num1;
        this.num2 = num2;
    }

     @Override
     public void run()
     {
        int sum = this.num1 + this.num2;
        System.out.println(sum);
     }
}
