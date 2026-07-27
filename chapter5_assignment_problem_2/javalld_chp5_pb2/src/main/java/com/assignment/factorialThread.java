package com.assignment;

import java.math.BigInteger;

/**
 * Hello world!
 */
public class factorialThread implements Runnable{
    private int num;
    private BigInteger result;

    public factorialThread(int num) {
        this.num = num;
        this.result = BigInteger.ONE;

    }

    private void factorial( )
    { 

        for(int i = 2; i <= this.num; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        } 
    }
    
    @Override
    public void run()
    {
        factorial(); 
    }

    public BigInteger getResult()
    {
        return this.result;
    }


}
