Invalid Book Name Exception (Assignment):
===========================================

Problem Statement:
-----------------
Implement a class BookNameValidator that validates a book name. The validation requires that the book name must start with the string "Scaler Java". If the book name doesn't start with "Scaler Java", raise a custom exception InvalidBookNameException with the message "Book name doesn't start with Scaler Java". If the book name starts with "Scaler Java", print "Book created!:<book_name>".

Task Description:
-----------------
In Java, custom exceptions are created by extending Exception (or RuntimeException), and methods that throw checked exceptions must declare them using the throws keyword.

Description:
------------
Implement a method divideNumbers(double dividend, double divisor) that divides two numbers. If the divisor is 0, throw a custom exception DivisionByZeroException with the message "Cannot divide by zero". Otherwise, return the division result.