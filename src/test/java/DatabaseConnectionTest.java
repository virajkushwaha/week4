import com.basicjunittesting.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }
    @AfterEach
    void afterEach() {
        dbConnection.disconnect();
    }
    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Connection should be established before test");
    }
    @Test
    void testConnectionClosedAfterTest() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Connection should be closed after test");
    }
}
