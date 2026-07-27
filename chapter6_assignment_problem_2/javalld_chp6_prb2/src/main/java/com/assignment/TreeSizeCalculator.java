package com.assignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class TreeSizeCalculator {
    private Node root;
    private ExecutorService exService;
    private int size;

    public TreeSizeCalculator(Node root, ExecutorService exService)
    {
        this.root = root;
        this.exService = exService;
        this.size = 0;
    }

    public int getSize()
    {
        return size;
    }

    public int calculateSize() throws Exception
    {
        if(root == null)
            return 0;

        calculateSizeRecursive(root);
        return this.getSize();
    }

    public void calculateSizeRecursive(Node node) throws Exception
    {
        if(node == null)
            return;


        synchronized (this)
        {
            size++;
        }   
       Future<?> leftFuture = null;
       Future<?> rightFuture = null; 

        if(node.left != null) {
            leftFuture = exService.submit((Callable<Void>) () -> {
                calculateSizeRecursive(node.left);
                return null;
            });
        }
        
        if(node.right != null) {
            rightFuture = exService.submit((Callable<Void>) () -> {
                calculateSizeRecursive(node.right);
                return null;
            });
        }

        if(leftFuture != null) leftFuture.get();
        if(rightFuture != null) rightFuture.get();
    }

}
