
public class replaceWord {
    public static void main(String[] args) {
        String sentence = "I love Java programming.";
        String wordToReplace = "Java";
        String replacementWord = "Python";

        String modifiedSentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
