package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreeSizeCalculatorTest {

    @Test
    public void testTreeSize() throws Exception {
        // Creating a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        try {
            TreeSizeCalculator treeCalculator = new TreeSizeCalculator(root, executor);
            int size = treeCalculator.calculateSize();

            // Asserting the size of the binary tree
            assertEquals(7, size);
        } finally {
            executor.shutdown();
        }
    }
}