public class HarshadNumber {
    public static void main(String[] args) {
        int n = 18; // Example input
        int sumOfDigits = 0;
        int temp = n;

        // Calculate the sum of digits
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if the number is a Harshad number
        if (n % sumOfDigits == 0) {
            System.out.println(n + " is a Harshad number.");
        } else {
            System.out.println(n + " is not a Harshad number.");
        }
    }
    
}
