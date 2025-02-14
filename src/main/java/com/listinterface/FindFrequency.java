package com.listinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequency {
    // Find frequency of elements in a list
    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : list) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Frequency Map: " + findFrequency(words));
    }
}
