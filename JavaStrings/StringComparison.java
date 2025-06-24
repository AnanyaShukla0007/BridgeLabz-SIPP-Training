import java.util.*;

public class StringComparison {
    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean custom = compare(a, b);
        boolean builtin = a.equals(b);
        System.out.println("Custom: " + custom + ", Built-in: " + builtin);
    }
}
