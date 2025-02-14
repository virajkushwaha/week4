package studentdata;

import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\studentdata\\studentdatafile.txt";

        // Writing student details to a binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101); // Roll Number
            dos.writeUTF("John Doe"); // Name
            dos.writeDouble(3.75); // GPA

            System.out.println("Student data saved successfully in " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing data: " + e.getMessage());
            e.printStackTrace();
        }

        // Reading student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Retrieved Student Data:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("An error occurred while reading data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

