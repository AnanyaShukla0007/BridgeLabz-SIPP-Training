import java.util.*;
public class VolumeOfCylinder {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt(),h=sc.nextInt();
		System.out.println(3.14*(r*r)*h);
        sc.close();
	}
}
