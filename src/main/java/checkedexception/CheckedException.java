package checkedexception;
import java.io.*;
public class CheckedException {
    public static void main(String[] args) {

            String filePath = "data.txt"; // Specify the file name

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

