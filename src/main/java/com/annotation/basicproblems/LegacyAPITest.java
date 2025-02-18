package annotation.basicproblems;

// Class with deprecated and updated methods
class LegacyAPI {
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
public class LegacyAPITest {
    public static void main(String[] args) {
        // Create an instance of LegacyAPI
        LegacyAPI api = new LegacyAPI();

        // Call the deprecated method
        api.oldFeature(); // Warning: This method is deprecated

        // Call the new method
        api.newFeature(); // Output: This is the new feature, use this instead.
    }
}

