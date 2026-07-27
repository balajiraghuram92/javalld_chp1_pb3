package com.assignment;

import java.util.List;
import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class ImagePainter{ 

     public static void paintQuadrant(String[][] matrix, int startRow, int startCol, int endRow, int endCol, String color)
    {
         for(int i = startRow; i < endRow; i++)
        {
            for(int j = startCol; j < endCol; j++)
            {
                matrix[i][j] = color;
            }
        }
    }
    
    public static void divideAndPaint(String[][] matrix, List<String> colors) throws Exception  
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int midRow = rows/2;
        int midCol = cols/2;

       ExecutorService ex = Executors.newFixedThreadPool(4);

       List<Callable<Void>> tasks = Arrays.asList(
       (Callable<Void>) () -> { paintQuadrant(matrix, 0, 0, midRow, midCol, colors.get(0)); return null;},
       (Callable<Void>)() -> { paintQuadrant(matrix, 0, midCol, midRow, cols, colors.get(1)); return null;},
       (Callable<Void>)() -> { paintQuadrant(matrix, midRow, 0, rows, midCol, colors.get(2)); return null;},
       (Callable<Void>)() -> { paintQuadrant(matrix, midRow, midCol, rows, cols, colors.get(3)); return null;}
       );

       ex.invokeAll(tasks);
       ex.shutdown();

    }
}
