package annotation.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;

// Define the @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name(); // Custom key for the JSON field
}

// Class to serialize
class User1 {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String ignoreThisField;

    public User1(String username, int age) {
        this.username = username;
        this.age = age;
        this.ignoreThisField = "Ignore me!";
    }
}

// Utility class for serialization
class JsonSerializer {

    public static String toJson(Object object) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");

        for (Field field : object.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                json.append("\"").append(annotation.name()).append("\":\"").append(field.get(object)).append("\", ");
            }
        }

        // Remove trailing comma and space, close the JSON
        if (json.length() > 1) {
            json.setLength(json.length() - 2);
        }
        json.append("}");
        return json.toString();
    }
}

// Main class to test serialization
public class CustomJsonSerialization {
    public static void main(String[] args) throws Exception {
        User1 user = new User1("Alice", 30);
        System.out.println(JsonSerializer.toJson(user));
    }
}
