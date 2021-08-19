package com.data.structures;

import java.util.Objects;

public class Node <Generic> {
    // Object Node contains the following data members: data of type generic and next of type pointer.
    private Generic data;
    private Node next;

    // No args constructor
    public Node() {
        this.data = data;
        this.next = next;
    }

    // Constructor takes in any form of data when instantiated.
    public Node(Generic data) {
        this.data = data;
        this.next = next;
    }

    // Getter and Setter for the Node class. Employees the OOP principle of encapsulation.
    public Generic getData() {
        return data;
    }

    public void setData(Generic data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Mandatory override of Object methods.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(getData(), node.getData()) && Objects.equals(getNext(), node.getNext());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), getNext());
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
