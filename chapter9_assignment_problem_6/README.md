Unique Persons Finder Challenge:
=========================

Problem Statement:
----------------- 
In this challenge, you will work with a Person class, which represents individuals with name and age attributes. Your task is to implement the find_unique_persons function. This function should take a list of Person objects as input and return a new list that contains only unique persons based on their names. It's important that this function maintains the order of appearance and includes only the first occurrence of each unique name, disregarding subsequent duplicates..

Task Description:
-----------------

In Java, we can achieve the exact same behavior using a HashSet<String> to track visited names while adding unique Person objects to a result List<Person>.
 
Description:
------------

Implement a method findUniquePersons(List<Person> persons) that takes a list of Person objects and returns a new list containing only the first occurrence of each person based on their name. The order of appearance must be strictly preserved.