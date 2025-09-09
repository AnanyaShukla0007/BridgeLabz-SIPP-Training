import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatUtil {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

public class DateFormat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("dd-MM-yyyy: " + DateFormatUtil.formatDate(today, "dd-MM-yyyy"));
        System.out.println("MM/dd/yyyy: " + DateFormatUtil.formatDate(today, "MM/dd/yyyy"));
        System.out.println("yyyy/MM/dd: " + DateFormatUtil.formatDate(today, "yyyy/MM/dd"));
        System.out.println("E, MMM dd yyyy: " + DateFormatUtil.formatDate(today, "E, MMM dd yyyy"));
    }
}
