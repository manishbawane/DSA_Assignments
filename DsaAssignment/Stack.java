package DsaAssignment;

import java.util.Scanner;

class Stack {
    private char[] stack;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new char[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char c) {
        if (!isFull()) {
            stack[++top] = c;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return '\0'; 
    }

    public String reverseString(String input) {
        for (char c : input.toCharArray()) {
            push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!isEmpty()) {
            reversed.append(pop());
        }

        return reversed.toString();
    }
}


