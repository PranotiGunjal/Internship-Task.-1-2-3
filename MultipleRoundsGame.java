import java.util.Scanner;

public class MultipleRoundsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int round = 1;
            int totalScore = 0;

            System.out.println("Round " + round);
            int score = playRound();
            totalScore += score;
            System.out.println("Your score for this round: " + score);
            System.out.println("Total score: " + totalScore);

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAnotherRound = scanner.next().toLowerCase();

            if (!playAnotherRound.equals("yes")) {
                playAgain = false;
            } else {
                round++;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static int playRound() {
        // Add your game logic here.
        // Return the player's score for this round.
        return (int) (Math.random() * 10);
    }
}
