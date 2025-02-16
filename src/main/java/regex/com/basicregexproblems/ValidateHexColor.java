package regex.com.basicregexproblems;
//Import the packages

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class ValidateHexColor {
    public  static  void  main  (String[] args) {
        //regex pattern for strong username
        String regex =  "^#[0-9A-Fa-f]{6}$"  ;
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        //codes to validate
        String[] codes = {  "#AD7791"  ,  "#gg665323"  ,  "er35234"  ,  "#sd6789"  ,
                "#FF7654"  };
        //loop through to check each hex code validity
        for  (String code : codes) {
            //Matcher object for each color code.
            Matcher matcher = pattern.matcher(code);
            System.out.println(code +  " - "  + (matcher.matches()  ?  "Valid"  :
                    "Invalid"  ));
        }
    }
}
