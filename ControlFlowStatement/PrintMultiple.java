import java.util.Scanner;
public class PrintMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Example input
        int multiple = 1;

        for (int i = 1; i <= 10; i++) {
            multiple = n * i;
            System.out.println(n + " * " + i + " = " + multiple);
        }
    }
    
}
