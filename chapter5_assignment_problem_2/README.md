Multi-threaded Addition Program
Overview
This Java program demonstrates multi-threaded addition functionality using the Client and Adder classes. The program takes two integers as input from the user, creates a new thread, and invokes the Adder class to calculate and print the sum of the two numbers.

Implementation Details
Class Adder
Implements the Runnable interface (or extends the Thread class).

Represents a task that performs addition of two numbers.

Contains fields for num1 and num2.

Constructor accepts two integers (num1 and num2) provided as input.

Overrides the run() method to calculate and print the sum of num1 and num2.

Class Client
Contains a public static void main(String[] args) method that serves as the entry point of the program.

Prompts/reads two integers from the user using Scanner.

Creates an instance of the Adder class with the provided numbers.

Creates a new Thread with the Adder instance, starts the thread using .start(), and waits for its completion using .join().

Instructions
To run the program:

Execute the Client class's main() method.

Enter two numbers when prompted.

The program will execute the addition in a separate thread and print the sum of the provided numbers.

Ensure proper exception handling (e.g., handling InterruptedException for .join()).