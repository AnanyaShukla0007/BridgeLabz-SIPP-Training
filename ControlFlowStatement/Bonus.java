import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sal= scanner.nextInt();

        if(n>=5){
            double bonus = sal * 0.05;
            System.out.printf("Bonus: %.2f\n", bonus);

        }
        else{
            System.out.println("No Bonus for you!");
        }
    }
    
}
