package regex.com.basicregexproblems;
//Import the regex package

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidateUsername {
    public static void main(String[] args) {
        // String to store regex pattern
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        //usernames to validate
        String[] usernames = {  "KanchanSingh777"  ,  "kUchi_123"  ,  "jungKooK01"  ,
                "Miracle_123"  ,  "Valid_123@"  };

        //Loop through each username to check validity
        for(String username : usernames){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(username);
            System.out.println(username+" "+matcher.matches());
        }
    }
}
