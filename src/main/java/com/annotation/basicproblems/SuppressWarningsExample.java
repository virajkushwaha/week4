package annotation.basicproblems;
import java.util.ArrayList;

// Class with deprecated and updated methods
class DeprecatedFeatureAPI {
    // Old method marked as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature, which is deprecated.");
    }

    // New method to replace the old one
    public void newFeature() {
        System.out.println("This is the new feature, use this instead.");
    }
}

// Main class to test deprecated method behavior
public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Create an instance of DeprecatedFeatureAPI
        DeprecatedFeatureAPI api = new DeprecatedFeatureAPI();

        // Call the deprecated method
        api.oldFeature(); // Warning: This method is deprecated

        // Call the new method
        api.newFeature(); // Output: This is the new feature, use this instead.

        // Example of suppressing unchecked warnings
        ArrayList list = new ArrayList(); // Raw type without generics
        list.add("Unchecked Warning Suppressed");
        System.out.println("List: " + list);
    }
}


