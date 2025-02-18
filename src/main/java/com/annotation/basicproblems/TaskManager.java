package annotation.basicproblems;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed.");
    }

    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}
