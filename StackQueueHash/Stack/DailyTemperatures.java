import java.util.*;
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) temps[i] = sc.nextInt();
        int[] result = dailyTemperatures(temps);
        for (int r : result) System.out.print(r + " ");
    }
}