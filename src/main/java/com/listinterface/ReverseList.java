package com.listinterface;

import java.util.*;


public class ReverseList {
    // Reverse a List (ArrayList)
    public static <T> void reverseArrayList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    // Reverse a List (LinkedList)
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        ListIterator<T> leftIter = list.listIterator();
        ListIterator<T> rightIter = list.listIterator(list.size());
        int mid = list.size() / 2;
        for (int i = 0; i < mid; i++) {
            T temp = leftIter.next();
            T rightVal = rightIter.previous();
            leftIter.set(rightVal);
            rightIter.set(temp);
        }
    }

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
    }

}
