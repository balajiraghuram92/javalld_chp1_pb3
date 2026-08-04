package com.assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set; 
import java.util.stream.Collectors;

public class UniquePersonsFinder {
    
    public static List<Person> findUniquePersons(List<Person> persons)
    {
        Set<String> seenNames = new HashSet<>();

        return persons.stream()
                .filter( p -> seenNames.add(p.getName()))
                .collect(Collectors.toList());
    }
}
