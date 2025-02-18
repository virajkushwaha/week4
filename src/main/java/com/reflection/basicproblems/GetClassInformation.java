package reflection.basicproblems;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInformation {
    public static void main(String[] args) {
        // Create a scanner to accept class name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {
            // Load the class dynamically using the class name
            Class<?> clazz = Class.forName(className);

            // Display the class name
            System.out.println("Class: " + clazz.getName());

            // Get and display all fields (including private fields)
            System.out.println("\nFields:");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  " + field);
            }

            // Get and display all methods
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("  " + method);
            }

            // Get and display all constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor);
            }
        } catch (ClassNotFoundException e) {
            // Handle the case where the class name is invalid
            System.out.println("Class not found: " + className);
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}

