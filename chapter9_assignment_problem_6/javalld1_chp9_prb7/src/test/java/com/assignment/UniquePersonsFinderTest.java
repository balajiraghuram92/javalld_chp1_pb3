package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePersonsFinderTest {

    @Test
    public void testFindUniquePersons() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Alice", 35);
        Person person4 = new Person("Charlie", 40);

        List<Person> people = List.of(person1, person2, person3, person4);

        List<Person> uniquePersons = UniquePersonsFinder.findUniquePersons(people);

        // Ensure that uniquePersons contains 3 Person objects
        assertEquals(3, uniquePersons.size());

        // Ensure that the first occurrence of each name is included
        Set<String> names = uniquePersons.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());

        assertEquals(Set.of("Alice", "Bob", "Charlie"), names);
    }
}