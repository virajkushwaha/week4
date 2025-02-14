package com.smartwarehousesystem;

public class SmartWarehouseSystem {

    // Main method
    public static void main(String[] args) {

        // Object creation
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding Elements
        electronicsStorage.addItem(new Electronics("Laptop", 52300.60));
        electronicsStorage.addItem(new Electronics("Television", 50000));
        groceriesStorage.addItem((new Groceries("Banana", 40.00)));
        groceriesStorage.addItem(new Groceries("Grapes", 65.23));
        furnitureStorage.addItem(new Furniture("Bed", 47833.96));

        // Print the elements of Each class
        System.out.println("All Electronics: ");
        for (WarehouseItem item : electronicsStorage.getAllItems()){
            System.out.println(item);
        }

        System.out.println("All Groceries: ");
        for (WarehouseItem item : groceriesStorage.getAllItems()){
            System.out.println(item);
        }

        System.out.println("All Furniture: ");
        for (WarehouseItem item : furnitureStorage.getAllItems()){
            System.out.println(item);
        }
    }
}

