package com.assignment;

/**
 * Hello world!
 */
public final class NumberDivider {
    
    public static double divideNumbers(int num1, int num2) throws DivisionByZeroException
    {
        if(num2 == 0)
        {
            throw new DivisionByZeroException("Divisor is 0");
        }

        return num1 > 0 ? num1/num2 : 0;
    }
}
