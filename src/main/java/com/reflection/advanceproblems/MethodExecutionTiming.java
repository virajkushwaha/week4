package reflection.advanceproblems;

import java.lang.reflect.Method;

public class MethodExecutionTiming {

    // Measure execution time for all methods in a class
    public static void measureExecutionTime(Object obj) {
        try {
            // Get the class of the given object
            Class<?> clazz = obj.getClass();

            // Iterate through all methods in the class
            for (Method method : clazz.getDeclaredMethods()) {
                // Skip methods with parameters for simplicity
                if (method.getParameterCount() > 0) {
                    continue;
                }

                // Make private methods accessible
                method.setAccessible(true);

                // Record start time
                long startTime = System.nanoTime();

                // Invoke the method
                method.invoke(obj);

                // Record end time
                long endTime = System.nanoTime();

                // Calculate and print execution time
                System.out.println("Method: " + method.getName() + " | Execution Time: " + (endTime - startTime) + " nanoseconds");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage
        TestClass testClass = new TestClass();
        measureExecutionTime(testClass);
    }
}

// Example class with methods to test
class TestClass {
    public void methodOne() {
        for (int i = 0; i < 1000000; i++); // Simulate some work
        System.out.println("Method One executed.");
    }

    private void methodTwo() {
        for (int i = 0; i < 500000; i++); // Simulate some work
        System.out.println("Method Two executed.");
    }

    public void methodThree() {
        System.out.println("Method Three executed.");
    }
}
