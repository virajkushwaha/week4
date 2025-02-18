package com.annotation.basicproblems;

// Parent class Animal
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class Dog that overrides the makeSound method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Main class to test the functionality
public class AnimalSound {
    public static void main(String[] args) {
        // Create an instance of Dog
        Animal dog = new Dog();

        // Call the overridden makeSound method
        dog.makeSound(); // Output: Bark
    }
}

