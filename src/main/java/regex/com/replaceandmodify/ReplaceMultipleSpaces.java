package regex.com.replaceandmodify;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultipleSpaces {
    public  static  void  main  (String[] args) {
        String text=  "Visit https://www.google.com and  http://example.org for more info."  ;
        String regex=  "\\bhttps?://[^\\s]+\\b"  ;
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
