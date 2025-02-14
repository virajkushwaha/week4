package com.dynamiconlinemarket;

// Generic class where T represents a product category (String-based)
public class Product<T> {
    private String name;
    private double price;
    private T category; // Category as a string (e.g., "Books", "Clothing")

    // Constructor
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return this.price;
    }
    public T getCategory() {
        return category;
    }

    // Set new price after discount
    public void setPrice(double price) {
        this.price = price;
    }

    // ToString method to display product details
    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + (float)(price) + ", Category: " + category ;
    }
}
