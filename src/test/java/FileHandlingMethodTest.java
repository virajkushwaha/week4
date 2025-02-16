import com.basicjunittesting.FileHandlingMethod;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileHandlingMethodTest {

    private static final String TEST_FILE = "D:\\Training_Capgemini\\Week4\\Day5\\JunitTesting\\src\\main\\java\\com\\basicjunittesting\\Filedata.txt";
    private FileHandlingMethod fileProcessor;

    @BeforeEach
    public void setUp() {
        fileProcessor = new FileHandlingMethod();
    }

    @AfterEach
    public void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testWriteToFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);

        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    public void testReadFromFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);

        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }

    @Test
    public void testIOExceptionHandling() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("D:\\Training_Capgemini\\Week4\\Day5\\JunitTesting\\src\\main\\java\\com\\basicjunittesting\\Filedata.txt");
        });
    }
}
