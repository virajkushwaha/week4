package regex.com.replaceandmodify;
//Import all required packages

import java.util.List;
public class CensorBadWords {
    //method to replace bad words with ****
    public  static  String  censorBadWords  (String sentence,  List<String> badWords) {
        //loop through  string to check each word
        for  (String badWord : badWords) {
            sentence = sentence.replaceAll(badWord,  "****"  );
        }
        return  sentence;
    }
    public  static  void  main  (String[] args) {
        //Variable to store the sentence
        String sentence =  "This is a damn bad example with some stupid words."  ;
        //list of bad words
        List<String> badWords = List.of(  "damn"  ,  "stupid"  );
        //Print the censored words through method call
        System.out.println(censorBadWords(sentence, badWords));
    }
}
