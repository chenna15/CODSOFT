package PROJECTS;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange) + 1;
            int attempts = 0;
            int roundScore = 0;
            boolean roundWon = false;

            System.out.println("Round " + (rounds + 1));

            while (attempts < maxAttempts) {
                System.out.print("Guess the number (between 1 and " + maxRange + "): ");
                int userGuess = scanner.nextInt();

                if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    roundScore = maxAttempts - attempts;
                    roundWon = true;
                    break;
                }
                attempts++;
            }

            if (!roundWon) {
                System.out.println("Out of attempts. The correct number was " + targetNumber + ".");
            }

            score += roundScore;
            rounds++;

            System.out.println("Your score for this round: " + roundScore);
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Game over! You played " + rounds + " round(s) and your final score is: " + score);

        scanner.close();
    }
}
