package annotation.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH"; // Optional parameter with default value
}

// Class with methods marked as @ImportantMethod
class ExampleClass {

    @ImportantMethod(level = "CRITICAL")
    public void criticalMethod() {
        System.out.println("This is a critical method.");
    }

    @ImportantMethod
    public void highPriorityMethod() {
        System.out.println("This is a high-priority method.");
    }

    public void normalMethod() {
        System.out.println("This is a normal method.");
    }
}

// Main class to retrieve and print annotated methods
public class ImportantMethodTest {
    public static void main(String[] args) {
        Class<ExampleClass> clazz = ExampleClass.class;

        // Iterate through all methods in the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method has @ImportantMethod annotation
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}
