package regex.com.advancedproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public  class ExtractProgrammingLanguageNames {
    public  static  List<String>  extractProgrammingLanguages  (String  text) {
        List<String> languages =  new  ArrayList<>();
        String[] knownLanguages = {  "Java"  ,  "Python"  ,  "JavaScript"  ,  "Go"  ,  "C#"  ,
                "Ruby"  ,  "Swift"  };
        String regex =  "\\b("  + String.join(  "|"  , knownLanguages)  +  ")\\b"  ;
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher to find matches in the text
        Matcher matcher = pattern.matcher(text);
        // Loop through all matches and add them to  the list
        while  (matcher.find()) {
            languages.add(matcher.group());
        }
        return  languages;
    }
    public  static  void  main  (String[] args) {
        //Variable to store the text
        String text =  "I love Java, Python, and JavaScript,  but I haven't tried Go yet."  ;
        //List to store the names
        List<String> programmingLanguages = extractProgrammingLanguages(text);
        //Method call to print the names
        System.out.println(String.join(  ", "  , programmingLanguages));
    }
}
