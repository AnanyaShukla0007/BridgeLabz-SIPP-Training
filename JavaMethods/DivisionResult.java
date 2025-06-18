import java.util.Scanner;
public class DivisionResult {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), divisor = sc.nextInt();
        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
