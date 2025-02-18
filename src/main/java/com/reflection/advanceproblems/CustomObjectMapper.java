package reflection.advanceproblems;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    // Method to map properties from a Map to an object
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the provided class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate over each field in the class
            for (Field field : clazz.getDeclaredFields()) {
                // Make private fields accessible
                field.setAccessible(true);

                // Set the value of the field from the Map if it exists
                if (properties.containsKey(field.getName())) {
                    field.set(instance, properties.get(field.getName()));
                }
            }

            return instance; // Return the created object
        } catch (Exception e) {
            throw new RuntimeException("Error creating object: " + e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Object> properties = Map.of("name", "John", "age", 30);
        Person person = toObject(Person.class, properties);
        System.out.println("Person: " + person);
    }
}

// Example class to map
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

