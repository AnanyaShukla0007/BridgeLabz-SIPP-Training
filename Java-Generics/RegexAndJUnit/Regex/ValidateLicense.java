package regex;
import java.util.regex.*;

public class ValidateLicense {

	public static void main(String[] args) {
		 String regex = "^[A-Z]{2}[0-9]{4}$";  // Matches 2 to 4 digits
	        Pattern pattern = Pattern.compile(regex);
	        String input = "AB1234";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        if (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }


	}

}
