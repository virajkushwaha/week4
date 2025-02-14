package com.queueinterface;

import java.util.*;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n = 10;

        // Generating the first N binary numbers
        List<String> binaryNumbers = generateBinaryNumbers(n);

        // Printing the binary numbers
        System.out.println(binaryNumbers);
    }

    public static List<String> generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        // Start with "1" in the queue
        queue.add("1");

        // Generate N binary numbers
        for (int i = 0; i < n; i++) {
            // Dequeue the front binary number
            String binary = queue.remove();
            result.add(binary);

            // Enqueue the next two binary numbers
            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        return result;
    }
}

