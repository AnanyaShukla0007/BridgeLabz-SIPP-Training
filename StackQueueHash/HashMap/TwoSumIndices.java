import java.util.*;

public class TwoSumIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                System.out.println(map.get(comp) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No pair found");
    }
}
