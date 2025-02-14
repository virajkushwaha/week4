package com.mapinterface;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        // Input map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Invert the map
        Map<Integer, List<String>> invertedMap = invertMap(originalMap);

        // Print the inverted map
        System.out.println("Original Map: " + originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }

    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        // Create a new map to store the inverted result
        Map<Integer, List<String>> inverted = new HashMap<>();

        // Iterate through the original map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            // Add the key to the list corresponding to the value
            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        return inverted;
    }
}
