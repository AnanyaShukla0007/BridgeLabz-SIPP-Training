import java.util.*;

public class TrimSpaces {
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String getSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
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
        String str = sc.nextLine();
        int[] indices = findTrimIndices(str);
        String custom = getSubstring(str, indices[0], indices[1]);
        String builtin = str.trim();
        System.out.println("Custom trim: [" + custom + "]");
        System.out.println("Built-in trim: [" + builtin + "]");
        System.out.println("Are they equal? " + compare(custom, builtin));
    }
}
