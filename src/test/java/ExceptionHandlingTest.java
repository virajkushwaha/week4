import com.basicjunittesting.ExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTest {
    @Test
    void testDivideByZero() {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            exceptionHandling.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
