import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmComparison {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    public static void main(String[] args) {
        int size = 10000;
        Random rand = new Random();
        int[] original = rand.ints(size, 0, size).toArray();

        int[] arr = original.clone();
        long start = System.nanoTime();
        bubbleSort(arr);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start) / 1e6 + "ms");

        arr = original.clone();
        start = System.nanoTime();
        Arrays.sort(arr);
        end = System.nanoTime();
        System.out.println("Quick Sort: " + (end - start) / 1e6 + "ms");
    }
}
