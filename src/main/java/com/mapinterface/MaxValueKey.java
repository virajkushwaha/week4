package com.mapinterface;

import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        // Input map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Find the key with the highest value
        String maxKey = findMaxValueKey(map);

        // Print the result
        System.out.println("Input Map: " + map);
        System.out.println("Key with the Highest Value: " + maxKey);
    }

    public static String findMaxValueKey(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return null;
        }

        // To store the key with the maximum value
        String maxKey = null;
        // Initialize to the smallest possible value
        int maxValue = Integer.MIN_VALUE;

        // Iterate through the map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                // Update the maximum value
                maxValue = entry.getValue();
                // Update the key with the max value
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
