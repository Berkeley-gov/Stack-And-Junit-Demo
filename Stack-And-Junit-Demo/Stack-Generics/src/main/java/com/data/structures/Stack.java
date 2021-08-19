package com.data.structures;

import com.exceptions.StackIsEmptyException;

public class Stack {
    // Stack only contains two data members and that is head and count.
    // Head is used to track the node that's currently on top of the stack.
    private Node head;
    private int count;

    // No args constructor.
    public Stack() {
        this.head = null;
        this.count = 0;
    }

    // An args constructor that takes in data for testing purposes.
    public Stack(int count) {
        this.head = null;
        this.count = count;
    }

    // Count() method retrieves the current size of stack.
    public int count() {
        return this.count;
    }

    // isEmpty() method is used to check if the stack is empty.
    public boolean isEmpty() {
        if(this.head != null) {
            return false;
        } else {
            return true;
        }
    }

    // Contains() retrieves stack data if it exists.
    public Object contains(Object data) {
        if (head != null) {
            Node current = this.head;

            while (current != null) {
                if (current.getData().equals(data)) {
                    return current.getData();
                } else {
                    current = current.getNext();
                }
            }

        }

        return null;
    }

    // Push() method adds data to the stack.
    public void push(Object data) {
        if(data == null) {
            throw new StackIsEmptyException("Push failed because their was no data to add to the stack.");
        } else {
            Node nodeToAdd = new Node(data);
            nodeToAdd.setNext(head);

            head = nodeToAdd;
            this.count++;
        }
    }

    // Peek() method returns the head node and its respective data.
    public Object peek() {
        if(isEmpty()) {
            throw new StackIsEmptyException("Peek method failed because the stack is empty.");
        } else {
            return this.head.getData();
        }
    }

    // Pop() method removes data from the stack
    public boolean pop() {
        if(isEmpty()) {
            return false;
        } else {
            head = head.getNext();
            this.count--;
            return true;
        }
    }

    // Display() method well output all data in the stack to the console.
    public void display() {
        if(isEmpty()) {
            System.out.println("\nError: Stack is empty.");
        } else {
            Node current = head;

            while(current != null) {
                System.out.println("Element in stack: " + current.getData());
                current = current.getNext();
            }
        }
    }
}
