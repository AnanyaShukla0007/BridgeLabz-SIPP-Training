import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) minIdx = j;
            }
            int temp = scores[i]; scores[i] = scores[minIdx]; scores[minIdx] = temp;
        }

        for (int x : scores) System.out.print(x + " ");
    }
}
