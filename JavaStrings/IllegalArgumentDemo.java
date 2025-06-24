import java.util.*;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); 
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            handleException(text);
        }
    }
}
