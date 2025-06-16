import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();    
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();
        boolean isSpring = false;
        if (month == 3 || month == 4 || month == 5) {
            isSpring = true;
        } else if (month == 6 && day < 21) {
            isSpring = true;
        } else if (month == 2 || month == 1 || month == 12) {
            isSpring = false;
        } else if (month == 6 && day >= 21) {
            isSpring = false;
        }
        if(isSpring) {
            System.out.println("It is spring season.");
        } else {
            System.out.println("It is not spring season.");
        }
    }
}
