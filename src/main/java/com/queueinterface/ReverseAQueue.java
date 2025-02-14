package com.queueinterface;

import java.util.*;

public class ReverseAQueue {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 10, 90));

        // Reversing the queue
        Queue<Integer> reversedQueue = reverseQueue(queue);

        // Printing the reversed queue
        System.out.println(reversedQueue);
    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return queue;
        }

        // Remove the front element
        int front = queue.remove();

        // Recursively reverse the remaining queue
        reverseQueue(queue);

        // Add the removed element to the back of the queue
        queue.add(front);

        return queue;
    }
}
