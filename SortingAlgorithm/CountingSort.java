import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();

        int max = 18, min = 10;
        int[] count = new int[max - min + 1];
        for (int age : ages) count[age - min]++;

        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                System.out.print((i + min) + " ");
            }
        }
    }
}
