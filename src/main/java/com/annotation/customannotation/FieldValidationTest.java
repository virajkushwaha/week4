package annotation.customannotation;

import java.lang.annotation.*;

// Define the @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

// Class with a field-level annotation for validation
class User {

    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validateFields();
    }

    // Validate annotated fields
    private void validateFields() throws Exception {
        for (var field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength annotation = field.getAnnotation(MaxLength.class);
                field.setAccessible(true);
                String value = (String) field.get(this);
                if (value.length() > annotation.value()) {
                    throw new IllegalArgumentException(
                            "Field " + field.getName() + " exceeds maximum length of " + annotation.value()
                    );
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}

// Main class to test field validation
public class FieldValidationTest {
    public static void main(String[] args) {
        try {
            User validUser = new User("JohnDoe");
            System.out.println("Valid user created: " + validUser.getUsername());

            User invalidUser = new User("ThisUsernameIsTooLong");
        } catch (Exception e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}

