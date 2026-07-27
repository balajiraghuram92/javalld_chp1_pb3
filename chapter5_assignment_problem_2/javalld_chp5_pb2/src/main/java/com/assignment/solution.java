package com.assignment;

import java.math.BigInteger;

public class solution { 
  
    public static BigInteger computeLargeFactorial(int num) throws InterruptedException
    {
        factorialThread ft = new factorialThread(num);
        Thread t1 = new Thread(ft);

        t1.run();

        t1.join();

        return ft.getResult();
    } 
}
