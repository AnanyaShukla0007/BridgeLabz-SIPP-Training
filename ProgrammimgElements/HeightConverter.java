package Fundamentals;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextDouble();

        // Conversion
        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", cm, feet, inches);
        
        sc.close();
    }
}
