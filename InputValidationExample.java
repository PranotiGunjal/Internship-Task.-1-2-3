import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputValidationExample {
    public static void main(String[] args) {
        // Input validation for empty input
        String userInput = " "; // Replace with user input
        if (userInput.trim().isEmpty()) {
            System.out.println("Input cannot be empty.");
        } else {
            // Process the input
            System.out.println("Input is valid: " + userInput);
        }
        
        // Handling file errors
        String filePath = "file.txt"; // Replace with actual file path
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of the file
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            if (e instanceof java.io.FileNotFoundException) {
                System.out.println("File not found.");
            } else if (e instanceof java.io.IOException) {
                System.out.println("An error occurred while reading the file.");
            }
        }
    }
}
