package regex.com.advancedproblems;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindRepeatingWords {
    public  static  void  main  (String[] args) {
        //Variable to store the sample text
        String sentence =  "This is is a repeated repeated  word test.";
        String regex =  "\\b(\\w+)\\b\\s+\\b\\1\\b";

        // Compile the regex pattern with case-insensitive  flag
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        // Create a Matcher object to search for matches
        Matcher matcher = pattern.matcher(sentence);
        // HashSet to store unique repeated words
        HashSet<String> repeatedWords = new HashSet<>();

        // Loop through all matches and store the repeating  words
        while(matcher.find()) {
            repeatedWords.add(matcher.group(  1  ));
        }
        // Print the repeated words
        for(String word : repeatedWords) {
            System.out.println(word);
        }
    }
}
