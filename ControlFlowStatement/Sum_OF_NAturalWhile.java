import java.util.Scanner;
public class Sum_OF_NAturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();       
        int sum = 0;
        n=n+1;
        while(n-->0){
            sum += n;

        }
        System.out.println("Sum of  natural numbers is: " + sum);
    }
}
