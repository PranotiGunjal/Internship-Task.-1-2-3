import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int correctNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Try to guess it.");
        
        while (true) {
            System.out.print("Enter your guess: ");
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
                System.out.println("It took you " + attempts + " attempts.");
                break;
            }
        }
        
        scanner.close();
    }
}
