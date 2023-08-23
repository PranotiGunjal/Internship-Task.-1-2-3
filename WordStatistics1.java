import java.util.HashMap;
import java.util.HashSet;

public class WordStatistics1 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        if (words == null || words.length == 0) {
            System.out.println("No words to process.");
            return;
        }

        HashSet<String> stopWords = new HashSet<>();
        stopWords.add("the");
        stopWords.add("and");
        stopWords.add("is");
        // Add more stop words as needed

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (!stopWords.contains(word)) {
                if (wordCounts.containsKey(word)) {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }
        }

        int totalCount = 0;
        for (int count : wordCounts.values()) {
            totalCount += count;
        }

        int uniqueWordCount = wordCounts.size();

        System.out.println("Word counts (excluding stop words):");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }

        System.out.println("Total word count (excluding stop words): " + totalCount);
        System.out.println("Number of unique words: " + uniqueWordCount);
    }
}
