import java.util.*;

public class StringLengthFinder {
    public static int customLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Custom length: " + customLength(text));
        System.out.println("Built-in length: " + text.length());
    }
}
