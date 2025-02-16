import com.basicjunittesting.CheckEven;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckEvenTest {

    private final CheckEven checker = new CheckEven();
    @Test
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void testIsEven(int number) {
        if (number % 2 == 0) {
            assertTrue(checker.isEven(number));
        } else {
            assertFalse(checker.isEven(number));
        }
    }
}