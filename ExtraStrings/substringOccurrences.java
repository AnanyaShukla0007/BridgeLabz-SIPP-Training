
public class substringOccurrences {
    public static void main(String[] args) {
        String str = "banana";
        String sub = "ana";
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) count++;
        }
        System.out.println("Occurrences: " + count);
    }
}
