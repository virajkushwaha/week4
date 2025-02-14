package com.setinterface;

import java.util.*;

public class CheckSubset {
    public static void main(String[] args) {
        // Defining two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        // Checking if set1 is a subset of set2
        boolean isSubset = isSubsetOf(set1, set2);

        // Printing the result
        System.out.println(isSubset);
    }

    public static boolean isSubsetOf(Set<Integer> subset, Set<Integer> superset) {
        // Check if all elements in subset are contained in superset
        return superset.containsAll(subset);
    }
}
