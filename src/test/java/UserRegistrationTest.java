import com.advancejunittesting.UserRegistration;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private UserRegistration userRegistration;
    @BeforeEach
    public void setUp() {
        userRegistration = new UserRegistration();
    }
    @Test
    public void testValidUserRegistration() {
        assertDoesNotThrow(() -> userRegistration.registerUser("KanchanSingh", "kannursingh2004@gmail.com", "kuchukoo123"));
    }

    @Test
    public void testInvalidUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("", "kannursingh@gmail.com", "Kuchukoo123");
        });
        assertEquals("Invalid username", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("Kanchan Singh", "kannursingh@gmailcom", "kannur34567");
        });
        assertEquals("Invalid email", exception.getMessage());
    }

    @Test
    public void testInvalidPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userRegistration.registerUser("KanchanSingh", "kannursingh@gmail.com", "pass");
        });
        assertEquals("Invalid password", exception.getMessage());
    }
}