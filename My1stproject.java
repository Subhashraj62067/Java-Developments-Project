import java.util.Scanner;
import java.util.Random;
public class My1stproject  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            // Generate a random number between 1 and 100
            int randomNumber = random.nextInt(100) + 1;
            int attemptsLeft = 5; // Set the maximum number of attempts
            boolean guessedCorrectly = false;

            System.out.println("\nA random number has been generated between 1 and 100.");
            System.out.println("You have " + attemptsLeft + " attempts to guess the number!");

            // Guessing loop
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    score += attemptsLeft; // Add remaining attempts to the score
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts! The correct number was " + randomNumber);
            }

            System.out.println("Your current score: " + score);

            // Ask the user if they want to play another round
            System.out.print("\nDo you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("\nThanks for playing! Your final score is: " + score);
        scanner.close();
    }
}
