Multithreaded Table Creator

Overview

In this programming challenge, you are tasked with completing the implementation of a multithreaded table creator that prints the multiplication table for a given number. This task involves extending Java's Thread class (or implementing Runnable) to create a custom TableCreator class capable of running in its own thread.



Your implementation should enable multiple instances of TableCreator to run concurrently, each generating a multiplication table for a different number. The core functionality of your TableCreator class will revolve around printing a multiplication table for the number provided to it, from 1 to 10.



Requirements

TableCreator Class

Class Definition: Create a class named TableCreator that extends Thread (or implements Runnable).



Initialization: The constructor should accept a single integer num during initialization.



Thread Execution (run method): Implement the run() method to print the multiplication table for the initialized number, from 1 to 10. Each line printed must strictly follow this format:



Plaintext

<num> times <i> is <result>

<num>: The initialized number.  



<i>: The current multiplier (from 1 to 10).  



<result>: The product of <num> and <i>.

