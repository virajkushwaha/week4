package com.extras.shoppingcart;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        cart.addItem("Gauva", 1.99);
        cart.addItem("Lichi", 0.99);
        cart.addItem("Pineapple", 2.49);
        cart.addItem("Cherry", 1.49);
        cart.addItem("Gauva", 1.99);

        // Displaying cart contents
        System.out.println("Items in HashMap (unsorted): " + cart.getItemsHashMap());
        System.out.println("Items in LinkedHashMap (order added): " + cart.getItemsLinkedHashMap());
        System.out.println("Items in TreeMap (sorted by price): " + cart.getItemsTreeMap());
    }

    // HashMap to store product prices
    private final HashMap<String, Double> itemsHashMap;

    // LinkedHashMap to maintain order of items added
    private final LinkedHashMap<String, Double> itemsLinkedHashMap;

    // TreeMap to sort items by price
    private final TreeMap<String, Double> itemsTreeMap;

    public ShoppingCart() {
        itemsHashMap = new HashMap<>();
        itemsLinkedHashMap = new LinkedHashMap<>();
        itemsTreeMap = new TreeMap<>(Comparator.comparingDouble(itemsHashMap::get));
    }


     // Add an item to the cart.
    public void addItem(String product, double price) {
        // Add the product and price to the HashMap
        itemsHashMap.put(product, price);

        // Update LinkedHashMap to maintain insertion order
        itemsLinkedHashMap.put(product, price);

        // Update TreeMap for sorting by price
        itemsTreeMap.put(product, price);
    }


     // Retrieve items in HashMap (unsorted).
    public Map<String, Double> getItemsHashMap() {
        return new HashMap<>(itemsHashMap);
    }


     // Retrieve items in LinkedHashMap (order added).
    public Map<String, Double> getItemsLinkedHashMap() {
        return new LinkedHashMap<>(itemsLinkedHashMap);
    }


     // Retrieve items in TreeMap (sorted by price).
    public Map<String, Double> getItemsTreeMap() {
        // Sorting items by price using TreeMap
        TreeMap<String, Double> sortedByPrice = new TreeMap<>(Comparator.comparingDouble(itemsHashMap::get));
        sortedByPrice.putAll(itemsHashMap);
        return sortedByPrice;
    }
}
