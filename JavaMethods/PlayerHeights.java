import java.util.Random;
public class PlayerHeights {
    public static int[] generateHeights() {
        Random r = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) heights[i] = 150 + r.nextInt(101);
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int x : arr) m = Math.min(m, x);
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int x : arr) m = Math.max(m, x);
        return m;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Mean Height: " + (double)sum(heights) / heights.length);
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}
