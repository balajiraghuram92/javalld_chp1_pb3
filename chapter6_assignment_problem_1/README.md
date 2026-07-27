Parallel Matrix Painting

Overview

In this programming challenge, you are tasked with creating a Java program that divides a matrix into four quadrants and paints each quadrant with a different color using parallel processing. The program should leverage Java's ExecutorService thread pool to achieve concurrency and parallelism.



Requirements

1\. paintQuadrant Method

Signature: public static void paintQuadrant(String\[]\[] matrix, int startRow, int endRow, int startCol, int endCol, String color)



Takes a 2D matrix, start and end row indices, start and end column indices, and a color string.



Modifies the matrix in-place by setting all cells in the specified quadrant range to the given color.



2\. divideAndPaint Method

Signature: public static void divideAndPaint(String\[]\[] matrix, List<String> colors)



Takes a 2D string matrix and a list of four colors.



Calculates the mid-row and mid-column to split the matrix into four quadrants:



Top-Left



Top-Right



Bottom-Left



Bottom-Right



Uses Executors.newFixedThreadPool(4) (or Executors.newVirtualThreadPerTaskExecutor()) to submit four separate tasks to execute paintQuadrant concurrently.



Waits for all tasks/threads to finish execution (e.g., using Future.get() or ExecutorService.shutdown() with awaitTermination()) before returning.

