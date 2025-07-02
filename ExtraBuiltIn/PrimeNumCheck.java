import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = checkPrime(num);
        System.out.print(isPrime);
        scanner.close();
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
