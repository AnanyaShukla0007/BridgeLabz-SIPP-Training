package regex;
import java.util.*;
import java.util.regex.*;
public class ExtractProgramming {
	public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

      
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C", "C++", "C#", "Go", "Ruby", "Rust", "Kotlin", "Swift", "PHP", "TypeScript");

        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z+#]*\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> foundLanguages = new ArrayList<>();

        while (matcher.find()) {
            String word = matcher.group();
            if (languages.contains(word)) {
                foundLanguages.add(word);
            }
        }

      
        System.out.println( foundLanguages);
    }
}
