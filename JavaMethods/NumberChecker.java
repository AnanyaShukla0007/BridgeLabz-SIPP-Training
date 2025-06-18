public class NumberChecker {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum > n;
    }

    public static boolean isDeficient(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum < n;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    private static int factorial(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        int num = 145;
        System.out.println("Perfect: " + isPerfect(num));
        System.out.println("Abundant: " + isAbundant(num));
        System.out.println("Deficient: " + isDeficient(num));
        System.out.println("Strong: " + isStrong(num));
    }
}
