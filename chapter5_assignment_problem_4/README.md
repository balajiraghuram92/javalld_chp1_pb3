Multithreaded Class Demonstration Challenge
Overview
In this programming exercise, your goal is to implement a multithreaded application that demonstrates basic threading concepts in Java. Specifically, you will create two classes, Adder and Subtractor, both of which will extend Java's Thread class. Additionally, a Client class will manage these threads.

Tasks
1. Implement the Adder Class
Create a class Adder that extends Thread.

Override the run() method to print "I am the Adder class".

2. Implement the Subtractor Class
Create a class Subtractor that extends Thread.

Override the run() method to print "I am the Subtractor class".

3. Implement the Client Class
Create a class Client containing a public static void main(String[] args) method.

Inside main():

Print "I am the main class".

Initialize one instance of Adder and one instance of Subtractor.

Start both threads using .start().

Wait for both threads to complete using .join() before main() exits.

Guidelines
Make sure your implementation correctly uses Java's multithreading capabilities.

The order in which "I am the Adder class" and "I am the Subtractor class" are printed is non-deterministic due to thread scheduling.