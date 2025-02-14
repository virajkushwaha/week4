import static com.listinterface.FindFrequency.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class FindFrequencyTest {

    @Test
    public void testFindFrequency() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 1);

        assertEquals(expected, findFrequency(words));
    }

    @Test
    public void testFindFrequencyEmptyList() {
        List<String> words = Collections.emptyList();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, findFrequency(words));
    }

    @Test
    public void testFindFrequencySingleElement() {
        List<String> words = Arrays.asList("grape");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("grape", 1);

        assertEquals(expected, findFrequency(words));
    }
}
