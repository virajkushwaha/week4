package com.mapinterface;

import java.util.*;

public class GroupObjectByProperties {
    public static void main(String[] args) {
        // Input map
        Map<String, String> originalMap = new HashMap<>();
        originalMap.put("Sameer", "HR");
        originalMap.put("Bulbul", "IT");
        originalMap.put("Chandan", "HR");

        // Invert the map
        Map<String, List<String>> groupedMap = groupEmployees(originalMap);

        // Print the inverted map
        System.out.println("Original Map: " + originalMap);
        System.out.println("Grouped Map: " + groupedMap);
    }

    public static Map<String, List<String>> groupEmployees(Map<String, String> map) {
        // Create a new map to store the inverted result
        Map<String, List<String>> inverted = new HashMap<>();

        // Iterate through the original map
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Add the key to the list corresponding to the value
            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        return inverted;
    }
}
