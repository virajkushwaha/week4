package reflection.intermediateproblems;

import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    // Public methods of addition
    public int add(int a, int b) {
        return a + b;
    }
    // Public methods of subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Public methods of multiplication
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Create an instance of MathOperations
            MathOperations mathOperations = new MathOperations();

            // Get the Class object for MathOperations
            Class<?> clazz = mathOperations.getClass();

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
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

