package com.assignment;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class DoubleEvenNumbers { 

    private static boolean isEven(int num)
    {
        return num % 2 == 0;
    }

    private static int doubleEvenNumber(int num)
    {
        return num * 2;
    }
    public static List<Integer> filterAndDoubleEvenNumbers(List<Integer> numbers)
    {
        return numbers.stream()
                .filter(n -> DoubleEvenNumbers.isEven(n))
                .mapToInt(DoubleEvenNumbers::doubleEvenNumber)
                .boxed()
                .collect(Collectors.toList());
    }
}
