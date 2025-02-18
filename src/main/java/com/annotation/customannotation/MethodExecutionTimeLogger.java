package annotation.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the @LogExecutionTime annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

// Class with methods to measure execution time
class ExecutionTimer {

    @LogExecutionTime
    public void fastMethod() {
        // Simulate a fast method
        for (int i = 0; i < 1000; i++) {}
        System.out.println("Fast method executed.");
    }

    @LogExecutionTime
    public void slowMethod() {
        // Simulate a slow method
        for (int i = 0; i < 1000000; i++) {}
        System.out.println("Slow method executed.");
    }
}

// Main class to log execution time
public class MethodExecutionTimeLogger {
    public static void main(String[] args) throws Exception {
        ExecutionTimer timer = new ExecutionTimer();
        Method[] methods = ExecutionTimer.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(timer);
                long endTime = System.nanoTime();
                System.out.println("Execution time of " + method.getName() + ": " + (endTime - startTime) + " nanoseconds");
            }
        }
    }
}

