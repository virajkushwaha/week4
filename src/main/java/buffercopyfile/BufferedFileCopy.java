package buffercopyfile;

import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\buffercopyfile\\80mb.txt";
        String destBuffered = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\buffercopyfile\\destinationbuffer.txt";
        String destUnbuffered = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\buffercopyfile\\unbuffer.txt";

        long bufferedTime = copyFileBuffered(sourceFile, destBuffered);
        System.out.println("Buffered Stream Copy Time: " + bufferedTime + " nanoseconds");

        long unbufferedTime = copyFileUnbuffered(sourceFile, destUnbuffered);
        System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " nanoseconds");
    }

    // Copy file using Buffered Streams
    private static long copyFileBuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }

    // Copy file using Unbuffered Streams
    private static long copyFileUnbuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }
}

