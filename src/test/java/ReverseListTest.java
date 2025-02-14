import static com.listinterface.ReverseList.*;

import com.listinterface.ReverseList;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseListTest {

    @Test
    public void testReverseArrayList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseList.reverseArrayList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    public void testReverseArrayListEmpty() {
        List<Integer> list = new ArrayList<>();
        ReverseList.reverseArrayList(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testReverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseList.reverseLinkedList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    public void testReverseLinkedListEmpty() {
        LinkedList<Integer> list = new LinkedList<>();
        ReverseList.reverseLinkedList(list);
        assertTrue(list.isEmpty());
    }
}
