import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int userGuess;
        int attempts = 0;

        do {
            System.out.print("Guess the number between " + lowerBound + " and " + upperBound + ": ");
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        } while (userGuess != generatedNumber);

        scanner.close();
    }
}