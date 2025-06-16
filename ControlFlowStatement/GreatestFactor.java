import java.util.Scanner;


public class GreatestFactor {
    public static int greatestFactor(int n) {
        int greatest = 1; // Start with 1 as the smallest factor
        for (int i = 2; i <= n / 2; i++) { // Check factors up to n/2
            if (n % i == 0) { // If i is a factor of n
                greatest = i; // Update greatest factor
            }
        }
        return greatest; // Return the greatest factor found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();   
        if (n <= 1) {
            System.out.println("No factors for numbers less than or equal to 1.");
        } else {
            int greatest = greatestFactor(n);
            System.out.println("The greatest factor of " + n + " is: " + greatest);
        }
    }
}
