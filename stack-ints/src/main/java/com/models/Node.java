package com.models;

import java.util.Objects;

public class Node {
    private int data;
    private Node next;

    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }

    public Node getNextNode() {
        return this.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return getData() == node.getData() && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData(), next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
