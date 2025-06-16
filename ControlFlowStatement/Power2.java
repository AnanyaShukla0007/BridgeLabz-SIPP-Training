import java.util.Scanner;
public class Power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 1;

        for (int i = 0; i < n; i++) {
            power *= 2;
        }

        System.out.println("2 raised to the power of " + n + " is: " + power);
        sc.close();
    }
}
