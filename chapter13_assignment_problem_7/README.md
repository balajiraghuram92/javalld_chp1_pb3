
Divide by Zero Exception (Assignment):
===========================================

Problem Statement:
-----------------
Implement a function divide_numbers that takes two numbers dividend and divisor as input and divides them. If the divisor is zero, raise a custom exception DivisionByZeroError with the message "Cannot divide by zero". Otherwise, return the value of dividend / divisor.

Task Description:
-----------------
In Java, custom exceptions are created by extending Exception (or RuntimeException), and methods that throw checked exceptions must declare them using the throws keyword.

Description:
------------
Implement a method divideNumbers(double dividend, double divisor) that divides two numbers. If the divisor is 0, throw a custom exception DivisionByZeroException with the message "Cannot divide by zero". Otherwise, return the division result.