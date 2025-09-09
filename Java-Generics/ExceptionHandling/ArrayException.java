import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = input.nextInt();
		int[] arr = new int[size];
		try {
			if(size == 0) {
				input.close();
				throw new NullPointerException();
			}
		System.out.println("Enter "+size+" numbers :");
		for(int i = 0;i<size;i++) {
			arr[i]=input.nextInt();
		}
			System.out.print("Enter Index to find it's value:");
			int index = input.nextInt();
			System.out.println(arr[index]);
		}catch(NullPointerException e) {
			System.out.println("The array is Null");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of array");
			e.printStackTrace();
		}
		
		
		
	}
}