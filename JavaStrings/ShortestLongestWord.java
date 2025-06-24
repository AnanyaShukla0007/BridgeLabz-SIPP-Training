import java.util.*;

public class ShortestLongestWord {
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

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count++);
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[] result = findShortestLongest(words);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
