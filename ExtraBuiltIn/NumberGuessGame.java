import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && low <= high) {
            int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "?");
            String feedback = getUserFeedback(scanner);

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Guessed your number.");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Error");
        }
    }

    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Your feedback (high/low/correct): ");
        return scanner.nextLine();
    }
}
