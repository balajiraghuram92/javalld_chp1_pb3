package com.assignment;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class FruitFilter { 
    public static List<String> filterFruitsStartingWithA(List<String> fruits)
    {
        return fruits.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .collect(Collectors.toList());
    }
}
