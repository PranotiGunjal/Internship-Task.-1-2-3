import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        // Create a Random object
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their guess
        System.out.println("Guess the random number between 1 and 100:");

        // Read the user's guess
        int userGuess = scanner.nextInt();

        // Check if the guess is correct
        if (userGuess == randomNumber) {
               System.out.println("Congratulations! Your guess is correct.");
       
             } else {
            System.out.println("Sorry, the correct number was " + randomNumber);
        }

        // Close the scanner
        scanner.close();
    }
}
