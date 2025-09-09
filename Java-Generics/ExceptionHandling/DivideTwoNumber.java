import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideTwoNumber {
	public static int divide(int a , int b) {
		int y = 0;
		try {
			y = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Invalid division by zero");
		}
		return y;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number for division operation");
		try {
			int a = input.nextInt();
			int b = input.nextInt();
			float div = divide(a,b);
			if(div != 0) {
				System.out.println(div);
			}
		}catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}
		
	}
}