package com.setinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 6, 8, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        // Finding the symmetric difference
        Set<Integer> result = findSymmetricDifference(set1, set2);

        // Printing the result
        System.out.println(result);
    }

    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        // Create copies of the sets to avoid modifying the original sets
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);

        // Remove common elements
        result.removeAll(set2);
        temp.removeAll(set1);

        // Add the remaining elements from the second set
        result.addAll(temp);

        return result;
    }
}

