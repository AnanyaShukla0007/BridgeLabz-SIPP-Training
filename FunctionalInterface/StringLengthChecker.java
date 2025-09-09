package functionalInterface;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();

        String msg1 = "Hello World";
        String msg2 = "This is a very long message exceeding the limit";

        int limit = 20;

        System.out.println(msg1 + " -> " + 
            (lengthFunction.apply(msg1) > limit ? "Too Long" : "Within Limit"));
        
        System.out.println(msg2 + " -> " + 
            (lengthFunction.apply(msg2) > limit ? "Too Long" : "Within Limit"));
    }
}