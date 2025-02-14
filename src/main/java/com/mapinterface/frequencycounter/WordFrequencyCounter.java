package com.mapinterface.frequencycounter;
//Import the packages
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    // Method to count the frequency of each word in a text file
    public static Map<String, Integer> countWordFrequency(String filePath) throws IOException {

        // Create a map to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Create a buffered reader to read the text file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {

            // Split the line into words, ignoring case and punctuation
            String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
            for (String word : words) {

                // Update the frequency of each word in the map
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
        reader.close();
        return wordFrequency;
    }

    public static void main(String[] args) {
        // Path to the text file
        String filePath = "D:\\Training_Capgemini\\Week4\\Day2\\src\\main\\java\\com\\mapinterface\\frequencycounter\\Text.txt";

        try {
            // Count word frequencies and store the result in a map
            Map<String, Integer> wordFrequency = countWordFrequency(filePath);

            // Print the word frequencies
            System.out.println("Word Frequency: " + wordFrequency);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}