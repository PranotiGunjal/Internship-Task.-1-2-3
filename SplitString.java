import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SplitString {
    public static void main(String[] args) {
        String inputText = "Hello, world! This is a sample text.";
        
        // Split the string using space and punctuation as delimiters
        String[] words = inputText.split("[\\s\\p{Punct}]+");
        
        // Print the array of words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
