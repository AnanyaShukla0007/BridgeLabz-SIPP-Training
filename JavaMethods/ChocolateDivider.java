import java.util.Scanner;
public class ChocolateDivider {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
