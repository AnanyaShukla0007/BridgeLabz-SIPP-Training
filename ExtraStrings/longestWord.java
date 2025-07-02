
public class longestWord {
    public static void main(String[] args) {
        String sentence = "I love programming in Java";
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest Word: " + longest);
    }
}
