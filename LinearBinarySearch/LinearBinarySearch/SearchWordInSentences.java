public class SearchWordInSentences {
    public static String search(String[] sentences, String word) {
        for (String s : sentences) {
            if (s.contains(word)) return s;
        }
        return "Not Found";
    }
}