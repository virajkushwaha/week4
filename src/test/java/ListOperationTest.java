import com.basicjunittesting.ListOperations;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationTest {

    private ListOperations manager;
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        manager = new ListOperations();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        manager.addElement(list, 5);
        manager.addElement(list, 10);
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    public void testRemoveElement() {
        list.add(5);
        list.add(10);
        manager.removeElement(list, 5);
        assertTrue(!list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    public void testGetSize() {
        list.add(5);
        list.add(20);
        list.add(89);
        int size = manager.getSize(list);
        assertEquals(3, size);
    }
}
