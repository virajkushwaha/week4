package junit.basicjunittesting;

public class LongRunningTask {
    public String longRunningTask() throws InterruptedException {
        Thread.sleep(2000);
        return "Task Completed";
    }
}
