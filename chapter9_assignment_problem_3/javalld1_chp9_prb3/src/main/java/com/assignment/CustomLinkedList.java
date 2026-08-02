package com.assignment;

public class CustomLinkedList<T> { 
    private Node<T> head;
    private Node<T> tail;

    public CustomLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    public void append(T data) {
        // TODO: Implement append logic using head and tail
        if(head == null)
            this.head = new Node<T>(data);
        else if(tail == null) {
            Node<T> node = new Node<T>(data);  
            this.tail = node;
            this.head.setNext(this.tail);
        }
        else  
        {
            Node<T> node = new Node<T>(data);
            this.head.setNext(this.tail);            
            this.tail.setNext(node);
            this.tail = node;
        }
            
    }

    public void printList() {
        // TODO: Traverse from head to tail printing "data -> ... -> None"
        Node<T> node = this.head;
        while(node != null)
        {
            System.out.print(node.getData() + " -> ");
            node = node.getNext();
        }
         System.out.println("None");
    }

    public Node<T> getHead() {
         // TODO: return head of linkedlist
         return head;
    }

    public Node<T> getTail() {
         // TODO: return tail of this linkedlist
         return tail;
    }
}