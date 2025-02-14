package largefilereader;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\largefilereader\\80mb.txt"; // Specify the file path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
