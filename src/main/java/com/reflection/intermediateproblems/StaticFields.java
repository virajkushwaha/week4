package reflection.intermediateproblems;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author1 {
    String name();
}

// Apply annotation to a class
@Author1(name = "John Doe")
class MathOperationsforstaticfields {
    // Public methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

// Configuration class with a private static field
class Configuration {
    private static String API_KEY = "default_key";

    public static String getApiKey() {
        return API_KEY;
    }
}

public class StaticFields {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Create an instance of MathOperationsforstaticfields
            MathOperationsforstaticfields mathOperations = new MathOperationsforstaticfields();

            // Get the Class object for MathOperationsforstaticfields
            Class<?> clazz = mathOperations.getClass();

            // Retrieve and display @Author1 annotation value
            if (clazz.isAnnotationPresent(Author1.class)) {
                Author1 author = clazz.getAnnotation(Author1.class);
                System.out.println("Class annotated with @Author1: " + author.name());
            } else {
                System.out.println("No @Author annotation found on the class.");
            }

            // Take user input for the method name and arguments
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Get the Method object for the specified method name
            Method method = clazz.getMethod(methodName, int.class, int.class);

            // Invoke the method dynamically
            int result = (int) method.invoke(mathOperations, num1, num2);

            // Display the result
            System.out.println("Result: " + result);

            // Access and modify the static field API_KEY in Configuration class
            Class<?> configClass = Configuration.class;
            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            // Make the field accessible
            apiKeyField.setAccessible(true);

            // Display the original value of API_KEY
            System.out.println("Original API_KEY: " + Configuration.getApiKey());

            // Modify the value of API_KEY
            apiKeyField.set(null, "new_secret_key");

            // Display the modified value of API_KEY
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

