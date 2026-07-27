package com.assignment;
import java.util.Scanner;


public class Client { 
    
    public static void main(String[] args) throws InterruptedException {
        // Initialize Scanner object to read from standard input (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Prompt (optional) and read the first integer
        // System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Prompt (optional) and read the second integer
        // System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner resource
        scanner.close();

        adder adder = new adder(num1, num2);
        Thread t1  = new Thread(adder);
        t1.run();

        t1.join();
    }
} 
