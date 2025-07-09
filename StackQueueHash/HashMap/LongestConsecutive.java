import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(sc.nextInt());

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int len = 1;
                while (set.contains(num + len)) len++;
                longest = Math.max(longest, len);
            }
        }
        System.out.println(longest);
    }
}
