package com.app;

import com.models.Stack;

public class Main {
    public static void main(String args[]) {
        Stack stack = new Stack();

        stack.push(12312312);
        stack.push(1455);
        stack.push(123);
        stack.push(420);

        System.out.println("\nElements in the stack is (4): " + stack.count());
        stack.contains();

        stack.pop();
        stack.peek();

        stack.pop();
        stack.peek();

        stack.pop();
        stack.peek();

        stack.contains();
        System.out.println("\nElements in the stack is (1): " + stack.count());
    }
}
