package com.setinterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        // Creating a HashSet with integers
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Converting the HashSet to a sorted list
        List<Integer> sortedList = convertToSortedList(hashSet);

        // Printing the sorted list
        System.out.println(sortedList);
    }

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Convert the set to a list
        List<Integer> list = new ArrayList<>(set);

        // Sort the list in ascending order
        Collections.sort(list);

        return list;
    }
}

