package Fundamentals;
import java.util.*;
public class StudentFees {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int fees=sc.nextInt();
		int discount=sc.nextInt();
		
		double dis=fees*discount/100;
		System.out.println("The discounted amount:"+(fees-dis));
	}
}
