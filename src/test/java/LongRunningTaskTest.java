import com.basicjunittesting.LongRunningTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class LongRunningTaskTest {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testLongRunningTask() throws InterruptedException {
        LongRunningTask task = new LongRunningTask();
        task.longRunningTask();
    }
}