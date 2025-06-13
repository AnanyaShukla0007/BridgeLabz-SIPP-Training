package Fundamentals;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: two floating point numbers
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN; // Handle division by zero

        // Output
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is:\n", number1, number2);
        System.out.printf("Addition: %.2f\n", addition);
        System.out.printf("Subtraction: %.2f\n", subtraction);
        System.out.printf("Multiplication: %.2f\n", multiplication);
        if (number2 != 0) {
            System.out.printf("Division: %.2f\n", division);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }

        sc.close();
    }
}

