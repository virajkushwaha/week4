package reflection.basicproblems;

import java.lang.reflect.Field;

class Person {
    // Private field
    private int age;

    // Constructor
    public Person(int age) {
        this.age = age;
    }

    // Getter for demonstration purposes
    public int getAge() {
        return age;
    }
}

public class AccessPrivateFields {
    public static void main(String[] args) {
        try {
            // Create an instance of the Person class
            Person person = new Person(25);

            // Get the Class object for the Person class
            Class<?> clazz = person.getClass();

            // Access the private field "age"
            Field ageField = clazz.getDeclaredField("age");

            // Make the field accessible
            ageField.setAccessible(true);

            // Retrieve and print the current value of the field
            System.out.println("Original age: " + ageField.get(person));

            // Modify the value of the field
            ageField.set(person, 30);

            // Retrieve and print the modified value of the field
            System.out.println("Modified age: " + ageField.get(person));
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
