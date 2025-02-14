package pipestream;

import java.io.*;

public class PipedStreamCommunication {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            // Writer thread
            Thread writerThread = new Thread(() -> {
                try (DataOutputStream dos = new DataOutputStream(pos)) {
                    for (int i = 1; i <= 5; i++) {
                        dos.writeUTF("Message " + i);
                        System.out.println("Written: Message " + i);
                        Thread.sleep(500); // Simulate processing delay
                    }
                } catch (IOException | InterruptedException e) {
                    System.out.println("Writer error: " + e.getMessage());
                    e.printStackTrace();
                }
            });

            // Reader thread
            Thread readerThread = new Thread(() -> {
                try (DataInputStream dis = new DataInputStream(pis)) {
                    for (int i = 1; i <= 5; i++) {
                        String message = dis.readUTF();
                        System.out.println("Read: " + message);
                    }
                } catch (IOException e) {
                    System.out.println("Reader error: " + e.getMessage());
                    e.printStackTrace();
                }
            });

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.out.println("Error in stream setup: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
