import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.listinterface.RemoveDuplicates.removeDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {
    // Test case for removing duplicates while preserving order
    @Test
    public void testRemoveDuplicates() {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(list);
        assertEquals(Arrays.asList(3, 1, 2, 4), result);
    }

}
