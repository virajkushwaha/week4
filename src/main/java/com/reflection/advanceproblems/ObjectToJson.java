package reflection.advanceproblems;

import java.lang.reflect.Field;

public class ObjectToJson {
    // Method to convert an object to a JSON-like string
    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder("{");

        try {
            // Get the class of the object
            Class<?> clazz = obj.getClass();

            // Iterate over each field in the class
            for (Field field : clazz.getDeclaredFields()) {
                // Make private fields accessible
                field.setAccessible(true);

                // Append field name and value to the JSON string
                json.append("\"").append(field.getName()).append("\": ");
                Object value = field.get(obj);
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                json.append(", ");
            }

            // Remove the trailing comma and space
            if (json.length() > 1) {
                json.setLength(json.length() - 2);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error generating JSON: " + e.getMessage(), e);
        }

        json.append("}");
        return json.toString(); // Return the JSON-like string
    }

    public static void main(String[] args) {
        // Example object
        PersonClass person = new PersonClass();
        person.name = "Alice";
        person.age = 25;

        // Convert to JSON and print
        String json = toJson(person);
        System.out.println("JSON Representation: " + json);
    }
}

// Example class to serialize
class PersonClass {
    public String name; // Made public for simplicity in this example
    public int age;
}

