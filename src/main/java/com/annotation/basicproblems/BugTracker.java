package annotation.basicproblems;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

public class BugTracker {
    @BugReport(description = "Null pointer exception occurs under certain conditions.")
    @BugReport(description = "Array index out of bounds exception when input size is large.")
    public void buggyMethod() {
        System.out.println("Executing buggy method.");
    }

    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("buggyMethod");
        BugReports bugReports = method.getAnnotation(BugReports.class);
        for (BugReport bug : bugReports.value()) {
            System.out.println("Bug Report: " + bug.description());
        }
    }
}
