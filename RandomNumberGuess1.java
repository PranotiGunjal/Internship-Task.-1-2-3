
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess1
 {
    public static void main(String[] args)
     {
        // Create a Random object
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = rand.nextInt(100) + 1;

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 0;

        while (true) {
            // Prompt the user to enter their guess
            System.out.print("Guess the random number between 1 and 100: ");
            int userGuess = scanner.nextInt();

            // Increment the number of tries
            numberOfTries++;

            // Compare the user's guess with the generated number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
                break; // Exit the loop if the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }

        // Provide feedback on the number of tries
        System.out.println("It took you " + numberOfTries + " tries to guess the correct number.");

        // Close the scanner
        scanner.close();
    }
}
