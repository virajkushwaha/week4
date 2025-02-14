package com.mapinterface;

import java.util.*;

public class MergeTwoMaps {
    public static void main(String[] args) {
        // Input maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merge the maps
        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        // Print the result
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Merged Map: " + mergedMap);
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Start with all entries from map
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Iterate through map2 and merge its entries into mergedMap
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return mergedMap;
    }
}
