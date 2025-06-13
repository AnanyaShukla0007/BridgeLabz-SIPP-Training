package Fundamentals;

public class DividePens {
	public static void main(String args[]) {
		int n=14;
		int ns=3;
		
		int rem=n%ns;
		n=n-ns;
		System.out.println("Each student will get "+n/3+" pens");
		System.out.println(rem+" These pens will be left");
	}

}
