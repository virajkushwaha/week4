package com.listinterface;

import java.util.*;

public class RemoveDuplicates {
    // Remove duplicates while preserving order
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new LinkedHashSet<>(list);
        return new ArrayList<>(seen);
    }

    public static void main(String[] args) {
        List<Integer> duplicates = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Unique List: " + removeDuplicates(duplicates));
    }
}
