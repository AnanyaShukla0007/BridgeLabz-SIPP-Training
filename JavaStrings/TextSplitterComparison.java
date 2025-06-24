import java.util.*;

public class TextSplitterComparison {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getLength(text); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                words.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        words.add(sb.toString());
        return words.toArray(new String[0]);
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");
        System.out.println(compare(custom, builtin));
    }
}
