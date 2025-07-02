import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = newDate.minusWeeks(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println( finalDate.format(formatter));
    }
}