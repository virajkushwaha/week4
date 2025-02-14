package wordcountinfile;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "E:\\CapgeminiTraining\\Program_Prerequisite\\Week4\\Day3_Streams\\src\\main\\java\\wordcountinfile\\inputfile.txt"; // Specify the file path
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }

        // Sort and display top 5 most frequent words
        wordCount.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
