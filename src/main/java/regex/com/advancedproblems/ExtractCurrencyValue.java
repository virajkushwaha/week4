package regex.com.advancedproblems;
//Import packages

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValue {
    public  static  void  main  (String[] args) {
        //Sample text to extract currency
        String text =  "The price is $45.99, and the  discount is 10.50."  ;
        // Regular expression to match currency values
        String regex =  "\\$?\\d+\\.\\d{2}"  ;
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a Matcher object for the text
        Matcher matcher = pattern.matcher(text);
        // Loop through all matches and add them to  the list
        while  (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
