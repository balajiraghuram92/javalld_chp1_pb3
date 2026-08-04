package com.assignment;

import java.util.Comparator;
import java.util.List; 
import java.util.stream.Collectors;

public class StudentSorter{ 

    public static List<Student> sortStudents(List<Student> students)
    {
        return students.stream()
         .sorted( Comparator.comparingInt(Student::getAge).thenComparing(Student::getName))
         .collect(Collectors.toList()); 
    }
 
}
