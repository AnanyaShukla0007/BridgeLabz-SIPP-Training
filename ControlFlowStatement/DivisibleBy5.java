import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by 5.");
        } else {
            System.out.println("The number " + number + " is not divisible by 5.");
        }
    }
}