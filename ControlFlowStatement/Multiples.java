import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Example input
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {
                count++;
            }
        }

        System.out.println("Count of multiples of " + n + " between 1 and 100 is: " + count);
    }
    
}
