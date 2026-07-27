Parallel Binary Tree Size Calculation (Java Version)
You need to calculate the size (total number of nodes) of a binary tree using parallel processing with Java's ExecutorService.

Requirements
Node Class

Represents a node in the binary tree.

Fields: data (int), left (Node), and right (Node).

TreeSizeCalculator Class

Fields:

root: Node

executor: ExecutorService

size: Tracks total node count (needs to be thread-safe or properly synchronized).

Methods:

calculateSize(): Calculates and returns total number of nodes. Handles the case where root is null.

calculateSizeRecursive(Node node): Helper method that processes node traversals in parallel using the ExecutorService.