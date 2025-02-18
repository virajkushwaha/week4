package annotation.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define the @Todo annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

// Class with methods marked as @Todo
class ProjectTasks {

    @Todo(task = "Implement login functionality", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {
        // Placeholder for login feature
    }

    @Todo(task = "Add password reset feature", assignedTo = "Bob")
    public void passwordResetFeature() {
        // Placeholder for password reset feature
    }

    @Todo(task = "Improve UI for the dashboard", assignedTo = "Charlie", priority = "LOW")
    public void dashboardUIFeature() {
        // Placeholder for dashboard UI improvements
    }
}

// Main class to retrieve and print all @Todo annotations
public class TodoAnnotationTest {
    public static void main(String[] args) {
        Class<ProjectTasks> clazz = ProjectTasks.class;

        // Iterate through all methods in the class
        for (Method method : clazz.getDeclaredMethods()) {
            // Check if the method has @Todo annotation
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}

