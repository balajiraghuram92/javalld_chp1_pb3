package com.assignment;

import java.util.List; 
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class DistinctNumbers { 

    public static List<Integer> getDistinctNumbers(List<Integer> numbers)
    {
        return numbers.stream()
               .distinct().collect(Collectors.toList());
    }
}
