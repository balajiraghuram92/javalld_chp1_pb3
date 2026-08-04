Student Sorting Challenge:
=========================

Problem Statement:
-----------------

The objective of this challenge is to implement a Java method that sorts a list of Student objects. The students should be sorted primarily by their marks in ascending order, and if two students have the same marks, they should be further sorted by their names in alphabetical order.

Task Description:
-----------------

In Java, sorting objects with tie-breakers is typically done using Comparator.comparing(...).thenComparing(...) or by implementing Comparable<Student>.

Task Description
Implement a method sortStudents(List<Student> students) that receives a list of Student objects and returns a new sorted list:

Primary Sort: marks in ascending order.

Secondary Sort: name in alphabetical order (ascending) for students with identical marks.