package regex.com.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public  class ExtractEmails {
    public  static  void  main  (String[] args) {
        //Variable to store regex pattern
        String regex=  "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}"  ;
        //Text to get test
        String text=  "Contact us at support@example.com  and info@company.org"  ;
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a Matcher object for the text
        Matcher matcher = pattern.matcher(text);
        // Loop through and find all email addresses  in the text.
        while  (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

