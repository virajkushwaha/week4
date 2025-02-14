package com.queueinterface;

import java.util.*;

public class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int x) {
        // Add the new element to queue2
        queue2.add(x);

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // Swap the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Remove and return the top element from the stack
    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.poll();
    }

    // Return the top element without removing it
    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display and remove the top element
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped: " + stack.pop());

        // Display and remove the next element
        System.out.println("Top element: " + stack.top());
        System.out.println("Popped: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

