import java.util.*;

public class PairWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Yes");
                return;
            }
            set.add(num);
        }
        System.out.println("No");
    }
}
