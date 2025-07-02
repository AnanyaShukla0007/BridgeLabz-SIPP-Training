import java.util.Scanner;

public class maxofthree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput(scanner);
        int num2 = getInput(scanner);
        int num3 = getInput(scanner);

        int max = findMax(num1, num2, num3);
        System.out.print(max);

    }

    public static int getInput(Scanner scanner) {
        return scanner.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
