import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCountProgram {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Enter text");
        System.out.println("2. Provide a file path");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String text = "";

        if (choice == 1) {
            System.out.println("Enter the text:");
            text = scanner.nextLine();
        } else if (choice == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    text += line + " ";
                }
            }
        }

        int wordCount = countWords(text);
        System.out.println("Word count: " + wordCount);
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }
}
