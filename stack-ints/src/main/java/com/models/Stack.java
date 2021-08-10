package com.models;

public class Stack {
    private Node head;
    private int count;

    public Stack() {
        this.head = null;
        this.count = 0;
    }

    public int count() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        newNode.setNextNode(head);
        head = newNode;

        this.count++;
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        } else {
            int resultFromPop = head.getData();
            head = head.getNextNode();

            this.count--;
            return resultFromPop;
        }
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        } else {
            System.out.println("\nElements in the stack: " + this.count);
            return this.head.getData();
        }
    }

    public boolean contains() {
        if(isEmpty()) {
            return false;
        } else {
            Node current = head;

            while(current != null) {
                System.out.println("Element in stack: " + current.getData());
                current = current.getNextNode();
            }

            return true;
        }
    }

    public Node getHead() {
        return this.head;
    }
}
