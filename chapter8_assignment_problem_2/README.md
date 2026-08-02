Problem Specification (Java)
=============================
Task Description
-----------------
Implement a class named FooBar that synchronizes two separate threads to print "foo" and "bar" in alternating order. The output must strictly follow the pattern "foobar" repeated n times.

Requirements:

Constructor FooBar(int n): Accepts an integer n representing how many times the sequence "foobar" should be printed.Method public void foo(): Called by Thread 

1. Must print "foo" $n$ times in synchronization with bar().Method public void bar(): Called by Thread

2. Must print "bar" $n$ times in synchronization with foo().Synchronization: Use java.util.concurrent.Semaphore (or explicit locks/conditions) to ensure "foo" is always printed before "bar" in every cycle.
