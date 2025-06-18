import java.util.Arrays;
public class DigitAnalyzer {
    public static int[] getDigits(int n) {
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sum(int[] digits) {
        int s = 0;
        for (int d : digits) s += d;
        return s;
    }

    public static int sumSquares(int[] digits) {
        int s = 0;
        for (int d : digits) s += d * d;
        return s;
    }

    public static boolean isHarshad(int n) {
        int[] digits = getDigits(n);
        return n % sum(digits) == 0;
    }

    public static int[][] digitFrequency(int n) {
        int[] count = new int[10];
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = count[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 132;
        int[] digits = getDigits(num);
        System.out.println("Sum: " + sum(digits));
        System.out.println("Sum of squares: " + sumSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(num));
        int[][] freq = digitFrequency(num);
        System.out.println("Digit frequencies:");
        for (int[] row : freq) if (row[1] > 0) System.out.println(row[0] + ": " + row[1]);
    }
}
