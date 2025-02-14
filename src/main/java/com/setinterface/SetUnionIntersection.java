package com.setinterface;
//Import required packages
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUnionIntersection {
    public static void main(String[] args) {
        //Create set variables using array as list
        Set<Integer> set1 = new HashSet<>(Arrays.asList(6,7,9,10,23));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,2,3,4,5,1,7,8,30,40,90));

        //Store the union set list in a variable
        Set<Integer> unionSet = unionOfSets(set1,set2);

        //Store the intersection set list in a variable
        Set<Integer> intersectionSet = intersectionOfSets(set1,set2);

        //Print the result.
        System.out.println(unionSet);
        System.out.println(intersectionSet);

    }

    //Method to store union of elements of two set
    private static Set<Integer> unionOfSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    //Method to store the common elements of two sets
    private static Set<Integer> intersectionOfSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
