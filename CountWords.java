import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CountWords {
    public static void main(String[] args) {
        String inputText = "Hello, world! This is a sample text.";
        
        // Split the string using space and punctuation as delimiters
        String[] words = inputText.split("[\\s\\p{Punct}]+");
        
        // Initialize a counter variable
        int wordCount = words.length;
        
        System.out.println("Number of words: " + wordCount);
    }
}
