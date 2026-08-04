package com.assignment;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentSorterTest {

    @Test
    public void testSortStudents() {
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 75);
        Student student3 = new Student("Charlie", 85);
        Student student4 = new Student("David", 90);

        List<Student> students = List.of(student1, student2, student3, student4);

        List<Student> sortedStudents = StudentSorter.sortStudents(students);

        // Ensure the sortedStudents list has the correct length
        assertEquals(4, sortedStudents.size());

        // Ensure the students are sorted by marks first, then by name if marks are equal
        List<String> expectedOrder = List.of("Bob", "Alice", "Charlie", "David");
        
        // Extract names from sorted students (equivalent to list comprehension in Python)
        List<String> actualOrder = sortedStudents.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        assertEquals(expectedOrder, actualOrder);
    }
}