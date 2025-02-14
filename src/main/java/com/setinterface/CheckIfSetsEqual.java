package com.setinterface;
//Import required packages
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfSetsEqual {
    public static void main(String[] args) {
        //Create set to store elements for comparison
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,2,3,4,5,1));

        //Check if the sets are equal or not using isSetEqual function
        if(isSetEquals(set1 ,set2)){
            System.out.println("Set1 and Set2 are equal");
            System.out.println(set1);
            System.out.println(set2);
        }
        else{
            System.out.println("Set1 and Set2 are not equal");
            System.out.println(set1);
            System.out.println(set2);
        }
    }

    //Method to check whether two sets are equal or not
    private static boolean isSetEquals(Set<Integer> set1, Set<Integer> set2) {
        if(set1.size() != set2.size()){
            return false;
        }
        //Loop through each element in set.
        for(int i = 0 ; i < set1.size() ; i++){
            if(!set1.containsAll(set2) && !set2.containsAll(set1)){
                return false;
            }
        }

        //Return the result
        return true;
    }
}
