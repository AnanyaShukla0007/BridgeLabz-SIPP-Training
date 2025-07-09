import java.util.*;

class ShortestSubarrayWithSumAtLeastK {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int res = n + 1;
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < prefix.length; i++) {
            while (!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k) {
                res = Math.min(res, i - deque.pollFirst());
            }
            while (!deque.isEmpty() && prefix[i] <= prefix[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.add(i);
        }

        return res <= n ? res : -1;
    }

    public static void main(String[] args) {
        ShortestSubarrayWithSumAtLeastK obj = new ShortestSubarrayWithSumAtLeastK();
        System.out.println(obj.shortestSubarray(new int[]{2, -1, 2}, 3)); // 3
    }
}