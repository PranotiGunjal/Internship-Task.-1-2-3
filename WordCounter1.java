import java.util.HashMap;

public class WordCounter1 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        int totalCount = 0;
        for (int count : wordCounts.values()) {
            totalCount += count;
        }

        System.out.println("Word counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }

        System.out.println("Total word count: " + totalCount);
    }
}
