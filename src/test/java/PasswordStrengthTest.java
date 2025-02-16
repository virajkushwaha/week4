import com.advancejunittesting.PasswordStrength;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthTest {
    private PasswordStrength passwordValidator;
    @BeforeEach
    public void setUp() {
        passwordValidator = new PasswordStrength();
    }
    @Test
    public void testValidPassword() {
        assertTrue(passwordValidator.validate("Kuchu0109"));
    }
    @Test
    public void testInvalidPasswordShort() {
        assertFalse(passwordValidator.validate("hsfb3849"));
    }
    @Test
    public void testInvalidPasswordNoUppercase() {
        assertFalse(passwordValidator.validate("jfbwjbwe"));
    }
    @Test
    public void testInvalidPasswordNoDigit() {
        assertFalse(passwordValidator.validate("PASSWORD"));
    }
    @Test
    public void testNullPassword() {
        assertFalse(passwordValidator.validate(null));
    }
}