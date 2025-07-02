import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = sc.nextDouble();
        System.out.print(cToF(celsius) + " " + fToC(fahrenheit));
    }

    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
}
