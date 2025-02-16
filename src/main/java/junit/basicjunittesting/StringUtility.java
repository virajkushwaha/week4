package junit.basicjunittesting;

public class StringUtility {
    public static void main(String[] args) {
        String str = "nitin";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + StringUtility.reverse(str));
        System.out.println("Is Palindrome: " + StringUtility.isPalindrome(str));
        System.out.println("Uppercase: " + StringUtility.toUpperCase(str));
    }

    // Method to reverse a string
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(reverse(str));
    }
    // Method to convert a string to uppercase
    public static String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }
}
