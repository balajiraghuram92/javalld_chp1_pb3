package com.assignment;

import java.lang.reflect.Constructor;

public class BankAccount {
    String accountNumber;
    int balance;
    double roi;

    // Constructor to initialize data members
    public BankAccount(String accountNumber, int balance, double roi) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.roi = roi;
    }

    // Method to calculate simple interest
    public double getSimpleInterest(int time) {
        // TODO: Write your logic here
        return (this.balance * this.roi * time) / 100.0;
    }

    // Method to calculate total balance with interest
    public double getBalanceWithInterest(int time) {
        // TODO: Write your logic here
        return this.balance + getSimpleInterest(time);
    }

    // Main method for local sandbox testing (System.out.println)
    public static void main(String[] args) {
        System.out.println("Hello World! BankAccount workspace is ready.");

        // Test your implementation interactively
        BankAccount account = new BankAccount("1234567890", 1000, 5);
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Simple Interest (1 year): " + account.getSimpleInterest(1));
        System.out.println("Balance with Interest (1 year): " + account.getBalanceWithInterest(1));
    }
}