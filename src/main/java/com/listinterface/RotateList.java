package com.listinterface;

import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        // Creating a list with sample values
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        // Rotating the list
        List<Integer> rotatedList = rotateList(numbers, rotateBy);

        // Printing the rotated list
        System.out.println(rotatedList);
    }

    public static List<Integer> rotateList(List<Integer> list, int position) {
        int i = position,idx;
        List<Integer> rotated = new ArrayList<>();
        //Add element with the index of rotation till it reach the same element index
        do{
            idx = i % list.size();
            rotated.add(list.get(idx));
            i++;

        }while(idx!=position-1);

        System.out.println(rotated);

        return rotated;
    }
}

