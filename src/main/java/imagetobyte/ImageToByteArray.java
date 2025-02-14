package imagetobyte;

import java.io.*;

public class ImageToByteArray {
    public static void main(String[] args) {
        String sourceImage = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\imagetobyte\\20240413.jpg";
        String destinationImage = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\imagetobyte\\20240504.jpg";

        try {
            // Read image into a byte array
            byte[] imageBytes = readImageToByteArray(sourceImage);

            // Write byte array back to an image file
            writeByteArrayToImage(imageBytes, destinationImage);

            System.out.println("Image conversion successful. Output file: " + destinationImage);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Method to read an image file into a byte array
    private static byte[] readImageToByteArray(String filePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(filePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    // Method to write a byte array back to an image file
    private static void writeByteArrayToImage(byte[] imageBytes, String filePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(filePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
