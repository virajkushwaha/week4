package regex.com.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    //method to check valid credit card
    public  static  boolean  isValidCreditCard  (String  cardNumber) {
        String visaPattern =  "^4[0-9]{15}$"  ;
        String masterCardPattern =  "^5[1-5][0-9]{14}$"  ;
        //compile the regex pattern
        Pattern pattern = Pattern.compile(visaPattern +  "|"  + masterCardPattern);
        Matcher matcher = pattern.matcher(cardNumber);
        //  return result
        return  matcher.matches();
    }
    public  static  void  main  (String[] args) {
        String visaCard =  "4235659573484676"  ;
        String masterCard =  "5424193245878538"  ;
        System.out.println(  "Visa Card Valid: "  + isValidCreditCard(visaCard));
        System.out.println(  "MasterCard Valid: "  + isValidCreditCard(masterCard));
    }
}
