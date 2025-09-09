import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println( username + "\" is a Valid Username.");
        } else {
            System.out.println(username + "\" is an Invalid Username.");
        }

    }

    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
}