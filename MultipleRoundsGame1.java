import java.util.Scanner;

public class MultipleRoundsGame1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int totalRoundsWon = 0;

        while (playAgain) {
            int round = 1;

            System.out.println("Round " + round);
            boolean roundWon = playRound();
            
            if (roundWon) {
                totalRoundsWon++;
                System.out.println("You won this round!");
            } else {
                System.out.println("You lost this round.");
            }
            
            System.out.println("Total rounds won: " + totalRoundsWon);

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAnotherRound = scanner.next().toLowerCase();

            if (!playAnotherRound.equals("yes")) {
                playAgain = false;
            } else {
                round++;
            }
        }

        System.out.println("Thanks for playing! Your final score is: " + totalRoundsWon);
        scanner.close();
    }

    public static boolean playRound() {
        // Add your game logic here.
        // Return true if the player wins the round, false if they lose.
        return Math.random() < 0.5; // Example: 50% chance of winning
    }
}
