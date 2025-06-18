import java.util.Scanner;
public class SumComparison {
    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rec = sumRecursive(n);
        int form = sumFormula(n);
        System.out.println("Recursive Sum: " + rec);
        System.out.println("Formula Sum: " + form);
    }
}
