import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter num1: ");
            int num1 = input.nextInt();
            System.out.print("Enter num2: ");
            int num2 = input.nextInt();
            int res = num1 / num2;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
            input.close(); 
        }
    }
}
