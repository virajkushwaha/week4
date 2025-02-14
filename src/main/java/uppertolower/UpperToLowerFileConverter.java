package uppertolower;

import java.io.*;

public class UpperToLowerFileConverter {
    public static void main(String[] args) {
        String sourceFile = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\uppertolower\\inputfile.txt"; // Input text file
        String destinationFile = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\uppertolower\\outputFile.txt"; // Output text file

        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), "UTF-8"));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destinationFile), "UTF-8"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine();
            }

            System.out.println("File conversion successful. Output saved in " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}