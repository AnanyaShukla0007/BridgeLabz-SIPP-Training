import java.util.*;

public class WordLengthTabular {
    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
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

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] result = getWordLengths(words);
;
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
