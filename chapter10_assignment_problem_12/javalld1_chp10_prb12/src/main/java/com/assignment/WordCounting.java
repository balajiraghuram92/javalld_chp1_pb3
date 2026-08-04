package com.assignment;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public final class WordCounting { 

    public static Map<String, Integer>  wordFrequencies(List<String> sentences){
        if (sentences == null || sentences.isEmpty()) {
            return Map.of();
        }
        
        Pattern wordPattern = Pattern.compile("\\W+");  

        return sentences.stream()
                .filter( s -> s != null || !s.isEmpty())
                .map(String::toLowerCase)
                .flatMap(wordPattern::splitAsStream) 
                .filter(w -> !w.isEmpty()) 
                .collect(Collectors.toMap(
                    w -> w,
                    w -> 1,
                    Integer::sum));
    }
}
