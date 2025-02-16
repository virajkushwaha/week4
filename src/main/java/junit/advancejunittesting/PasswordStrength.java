package junit.advancejunittesting;

public class PasswordStrength {
    // method to validate if a password meets the required criteria
    public boolean validate(String password) {
        // check if password is null or has less than 8 characters
        if (password == null || password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        boolean hasDigit = false;
        // iterate through each character in the password
        for (char c : password.toCharArray()) {
            // check if character is an uppercase letter
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            // check if character is a digit
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            // if both uppercase and digit are found
            if (hasUppercase && hasDigit) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        PasswordStrength validator = new PasswordStrength();
        System.out.println("Password 'KannurSingh2004' is valid: " + validator.validate("KannurSingh2004"));
        System.out.println("Password 'Kuchu0109' is valid: " + validator.validate("Kuchu0109"));
        System.out.println("Password 'PASSWORD1' is valid: " + validator.validate("PASSWORD"));
        System.out.println("Password 'Pass1' is valid: " + validator.validate("Pass1"));
    }
}
