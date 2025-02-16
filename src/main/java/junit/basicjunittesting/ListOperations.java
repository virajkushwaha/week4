package junit.basicjunittesting;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }
    // Method to remove an element from the list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }
    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
    public static void main(String[] args) {
        ListOperations manager = new ListOperations();
        // Create a new list of integers
        List<Integer> list = new ArrayList<>();
        // Add elements to the list
        manager.addElement(list, 55);
        manager.addElement(list, 100);
        manager.addElement(list,290);
        manager.addElement(list,10);
        manager.addElement(list,69);

        //Print list elements
        System.out.println("List after adding elements: " + list);
        // Get the size of the list
        int size = manager.getSize(list);
        System.out.println("Size of the list: " + size);

        // Remove an element from the list
        manager.removeElement(list, 55);
        System.out.println("List after removing element: " + list);
        // Get the size of the list
        size = manager.getSize(list);
        System.out.println("Size of the list: " + size);
    }
}
