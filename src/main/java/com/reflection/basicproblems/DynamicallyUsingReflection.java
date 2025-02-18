package reflection.basicproblems;

import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class DynamicallyUsingReflection {
    public static void main(String[] args) {
        try {
            // Get the Class object for the Student class directly
            Class<?> clazz = Student.class;

            // Get the constructor that matches the parameters (String, int)
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

            // Create a new instance of the Student class dynamically
            Object student = constructor.newInstance("Jungkook Jeon", 20);

            // Display the created object
            System.out.println("Dynamically created object: " + student);
        } catch (NoSuchMethodException e) {
            System.out.println("Constructor not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
