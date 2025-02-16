package regex.com.advancedproblems;
//Import the regex package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main (String[] args) {
        //Variable to store the text to get validated
        String text =  "My SSN is 123-45-6788."  ;
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Check if an SSN is found in the text
        if(matcher.find()) {
            System.out.println(  "Valid SSN Found: "  + matcher.group());
        }
        else{
            System.out.println(  "No valid SSN found."  );
        }
    }
}
