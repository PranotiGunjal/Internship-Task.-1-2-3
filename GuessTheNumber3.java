import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int correctNumber;
        int maxAttempts = 10; // You can change this to the desired number of attempts
        int attempts = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number game!");

        while (playAgain) {
            correctNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            attempts = 0;

            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it.");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
                if (scanner.hasNextInt()) {
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess < minRange || userGuess > maxRange) {
                        System.out.println("Please enter a number between " + minRange + " and " + maxRange + ".");
                    } else if (userGuess < correctNumber) {
                        System.out.println("Try a higher number.");
                    } else if (userGuess > correctNumber) {
                        System.out.println("Try a lower number.");
                    } else {
                        System.out.println("Congratulations! You guessed the correct number: " + correctNumber);
                        break;
                    }

                    if (attempts == maxAttempts) {
                        System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + correctNumber + ".");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
