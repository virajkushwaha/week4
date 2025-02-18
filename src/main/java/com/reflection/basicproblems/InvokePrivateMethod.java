package reflection.basicproblems;

import java.lang.reflect.Method;

class Calculator {
    // Private method
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of the Calculator class
            Calculator calculator = new Calculator();

            // Get the Class object for the Calculator class
            Class<?> clazz = calculator.getClass();

            // Access the private method "multiply"
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);

            // Make the method accessible
            multiplyMethod.setAccessible(true);

            // Invoke the method with arguments 5 and 10
            int result = (int) multiplyMethod.invoke(calculator, 576, 123);

            // Display the result
            System.out.println("Result of multiply(576, 123): " + result);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

