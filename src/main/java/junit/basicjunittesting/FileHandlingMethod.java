package junit.basicjunittesting;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandlingMethod {
    public static void main(String[] args) {
        //Create object of class
        FileHandlingMethod fileHandling = new FileHandlingMethod();

        //Variable to store path
        String filePath = "D:\\Training_Capgemini\\Week4\\Day5\\JunitTesting\\src\\main\\java\\com\\basicjunittesting\\Filedata.txt";
        String contentToWrite = "Hello, world!";

        try {
            // Write content to the file
            fileHandling.writeToFile(filePath, contentToWrite);
            System.out.println("Content written to file successfully.");

            // Read content from the file
            String contentRead = fileHandling.readFromFile(filePath);
            System.out.println("Content read from file: " + contentRead);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // writes content to the specified file
    public void writeToFile(String filePath, String content) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(content);
        writer.close();
    }
    // reads content from the specified file
    public String readFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
