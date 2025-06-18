public class PalindromeDuckChecker {
    public static int[] getDigits(int n) {
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isPalindrome(int[] digits) {
        int n = digits.length;
        for (int i = 0; i < n / 2; i++)
            if (digits[i] != digits[n - 1 - i]) return false;
        return true;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 101;
        int[] digits = getDigits(number);
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
