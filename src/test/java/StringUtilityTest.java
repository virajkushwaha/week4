import com.basicjunittesting.StringUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTest {
    @Test
    public void testReverse() {
        assertEquals("dcba", StringUtility.reverse("abcd"));
        assertEquals("racecar", StringUtility.reverse("racecar"));
        assertNull(StringUtility.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtility.isPalindrome("tut"));
        assertTrue(StringUtility.isPalindrome("madam"));
        assertFalse(StringUtility.isPalindrome("hello"));
        assertFalse(StringUtility.isPalindrome(null));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO",StringUtility.toUpperCase("hello"));
        assertEquals("WORLD",StringUtility.toUpperCase("world"));
        assertEquals("",StringUtility.toUpperCase(""));
        assertNull(StringUtility.toUpperCase(null));
    }
}
