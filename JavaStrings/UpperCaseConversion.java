import java.util.*;

public class UpperCaseConversion {
    public static String toUpper(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String custom = toUpper(text);
        String builtin = text.toUpperCase();
        System.out.println("Are both uppercase strings equal? " + compare(custom, builtin));
    }
}
