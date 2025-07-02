import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(input1);
        String input2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(input2);

        if(date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if(date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Date1 is equal to Date2");
        }
    }
}