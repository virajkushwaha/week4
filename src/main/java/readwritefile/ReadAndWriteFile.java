package readwritefile;
import java.io.*;
public class ReadAndWriteFile {
    public static void main(String[] args) {
        //Getting the source file
        String sourceFile = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\readwritefile\\source";
        //Taking file where are source text get copied
        String destinationFile = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\readwritefile\\destination";
        //Try Catch block for handling the exceptions
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
            //getting data into byte from
            int byteData = fis.read();
            while (byteData != -1) {
                fos.write(byteData);
                byteData = fis.read();
            }
            //If file copied successfully print it
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            //If file not found throw exception
            System.out.println("Error: Source file not found.");
            //If input output exception print it
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
        }
    }
}
