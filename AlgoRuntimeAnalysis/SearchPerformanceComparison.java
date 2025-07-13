import java.util.Arrays;

public class SearchPerformanceComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 1_000_000, target = size - 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        System.out.println("Linear Search: " + (end - start) / 1e6 + "ms");

        Arrays.sort(arr);
        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search: " + (end - start) / 1e6 + "ms");
    }
}
