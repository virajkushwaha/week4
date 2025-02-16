import com.advancejunittesting.DataFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    private final DataFormatter dateFormatter = new DataFormatter();
    @Test
    void testValidDate() {
        assertEquals("15-02-2025", dateFormatter.formatDate("2025-02-15"));
        assertEquals("10-06-2024", dateFormatter.formatDate("2024-06-10"));
    }
    @Test
    void testInvalidDate() {
        assertEquals("Invalid date format", dateFormatter.formatDate("invalid-date"));
        assertEquals("Invalid date format", dateFormatter.formatDate("2024/06/10"));
    }
}
