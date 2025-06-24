import java.util.*;

public class ArrayIndexExceptionDemo {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); 
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) names[i] = sc.next();
        try {
            generateException(names);
        } catch (Exception e) {
            handleException(names);
        }
    }
}
