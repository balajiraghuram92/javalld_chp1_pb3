Print in Order Challenge:
=========================

Problem Statement:
-------------------

In this challenge, you are required to ensure that three different methods print in strict sequence: "first", "second", and "third". You are given a class Foo with three methods:

first(): prints "first"
second(): prints "second"
third(): prints "third"
Your task is to modify the Foo class to ensure that these methods can only run in sequence (first, then second, then third), regardless of the order in which they're called in the code.

Task Description:
-----------------

Implement a class named Foo that ensures three separate threads calling first(), second(), and third() 
execute their actions in strict order: "first" $\rightarrow$ "second" $\rightarrow$ "third", regardless of the order in which the threads are started or scheduled by the OS.