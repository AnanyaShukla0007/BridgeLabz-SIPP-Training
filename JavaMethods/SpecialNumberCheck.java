public class SpecialNumberChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int square = n * n, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        return Integer.toString(sq).endsWith(Integer.toString(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon: " + isNeon(num));
        System.out.println("Spy: " + isSpy(num));
        System.out.println("Automorphic: " + isAutomorphic(num));
        System.out.println("Buzz: " + isBuzz(num));
    }
}
