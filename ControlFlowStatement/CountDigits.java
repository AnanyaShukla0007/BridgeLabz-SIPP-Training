public class CountDigits {
    public static void main(String[] args) {
        int n = 12345; // Example input
        int count = 0;

        while (n > 0) {
            n /= 10; // Remove the last digit
            count++; // Increment the count
        }

        System.out.println("Number of digits: " + count);
    }
    
}
