package com.dynamiconlinemarket;

public class Main {
    public static void main(String[] args) {
        // Create a product catalog
        ProductList catalog = new ProductList();

        // Create products with String categories
        Product<String> book1 = new Product<>("Harry Potter and The Cursed Child", 150, "Books");
        Product<String> shirt = new Product<>("T-Shirt", 199.99, "Clothing");
        Product<String> phone = new Product<>("Smartphone", 799, "Gadgets");

        // Add products to the catalog
        catalog.addProduct(book1);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Display the catalog before applying discount
        catalog.showCatalog();

        // Apply a discount to the book
        Discount.applyDiscount(book1, 10);

        // Apply a discount to the gadget
        Discount.applyDiscount(phone, 5);

        // Show catalog after applying discounts
        catalog.showCatalog();
    }
}
