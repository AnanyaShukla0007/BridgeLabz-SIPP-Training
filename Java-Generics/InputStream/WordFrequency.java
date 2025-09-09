import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class WordFrequency {
    public static void main(String[] args) {
        String fileName = "D:\BJLab\BridgeLab-SIPP-Training-2215001017\InputStream\file1.txt"; 

        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                
                line = line.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();

                String[] words = line.split("\\s+"); 

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

     
            int totalWords = wordCountMap.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("Total words in file: " + totalWords);

      
            List<Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
            sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        
            System.out.println("\nTop 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedEntries.size()); i++) {
                Entry<String, Integer> entry = sortedEntries.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}
