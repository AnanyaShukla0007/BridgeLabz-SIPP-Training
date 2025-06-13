import java.util.*;
public class Power {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int id=sc.nextInt();
		int p=1;
		for(int i=1;i<=id;i++) {
			p*=base;
		}
		System.out.println(p);
        sc.close();
	}
}