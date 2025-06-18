import java.util.Scanner;
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}
