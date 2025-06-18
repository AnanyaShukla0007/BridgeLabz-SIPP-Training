import java.util.Scanner;
public class SimpleCalendar {
    static String[] months = {"", "January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getStartDay(int month, int year) {
        int d = 1;
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }
        return (d + 2*m + 3*(m+1)/5 + y + y/4 - y/100 + y/400) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (month == 2 && isLeapYear(year)) days[2] = 29;
        int startDay = getStartDay(month, year);

        System.out.println("     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) System.out.print("    ");
        for (int day = 1; day <= days[month]; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
    }
}
