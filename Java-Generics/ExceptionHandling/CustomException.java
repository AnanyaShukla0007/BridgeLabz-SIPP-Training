import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(){}
} 

public class CustomException {
	public static void validateAge(int age) throws InvalidAgeException{
		if(age>=18) {
			System.out.println("Access granted!");
		}
		else {
			throw new InvalidAgeException();
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = input.nextInt();
		try {
		validateAge(age);
		}catch(Exception e){
			System.out.println("Invalid age");
			e.printStackTrace();
		}
		input.close();
	}
}