package regex.com.advancedproblems;
//Import packages

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    // Method to Check if the IP address is valid or not
    public  static  boolean  isValidIPv4  (String ipAddress)  {
        String regex =  "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
                +  "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
                +  "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."
                +  "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"  ;
        //compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        // return the result
        return  matcher.matches();
    }
    public  static  void  main  (String[] args) {
        //Variable to store the Sample IP address
        String ipAddress =  "192.168.1.1"  ;

        //Method call to validate the IP Address
        System.out.println(isValidIPv4(ipAddress));
    }
}
