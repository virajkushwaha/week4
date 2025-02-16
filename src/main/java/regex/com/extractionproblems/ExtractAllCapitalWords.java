package regex.com.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class ExtractAllCapitalWords {
    public  static  void  main  (String[] args) {
        //Variables to store text and the regex pattern
        String text=  "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        String regex=  "\\b[A-Z][a-z]*\\b"  ;
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a Matcher object for the text
        Matcher matcher = pattern.matcher(text);
        // Loop through and find all email addresses  in the text.
        System.out.println("Extracted result: ");
        while  (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
