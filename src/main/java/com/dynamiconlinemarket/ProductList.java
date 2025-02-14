package com.dynamiconlinemarket;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    // List of products with any category
    private final List<Product<?>> products;

    // Constructor
    public ProductList() {
        products = new ArrayList<>();
    }

    // Add a product to the catalog
    public void addProduct(Product<?> product) {
        products.add(product);
    }

    // Display all products
    public void showCatalog() {
        System.out.println("\n--- Product Catalog ---");
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}

