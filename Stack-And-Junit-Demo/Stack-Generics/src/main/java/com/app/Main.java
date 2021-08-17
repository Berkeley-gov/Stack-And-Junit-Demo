package com.app;

import com.data.structures.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello World! Welcome to my Stack demo.\n");

        Stack stackDemo = new Stack();

        stackDemo.push(1234);
        stackDemo.push(234);
        stackDemo.push(12.33453);
        stackDemo.push("Juan Ramirez was here");

        stackDemo.display();

        stackDemo.push("Please hire me! I am good enough.");
        System.out.println("\nElement at the head of the stack: " + stackDemo.peek());

        System.out.println("Stack contains the following amount of nodes/data: " + stackDemo.count());

        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();

        System.out.println("\nThree nodes have been popped off the stack. \nDisplaying current data in the stack.\n");
        stackDemo.display();

        System.out.println("\nStack now contains the following amount of nodes/data: " + stackDemo.count());
        System.out.println("\nStack contains 1234: " + stackDemo.contains(1234));
    }
}
