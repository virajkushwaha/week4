package com.listinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class FindNthElement {
    //Nth element from the end in LinkedList
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) first.next();
            else return null; // If n is greater than list size
        }
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Nth from End: " + findNthFromEnd(linkedList, 2));
    }
}
