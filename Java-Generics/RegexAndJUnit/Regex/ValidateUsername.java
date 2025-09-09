package regex;
import java.util.regex.*;

public class ValidateUsername {

	public static void main(String[] args) {
		 String regex = "^[a-zA-Z]+[a-zA-Z0-9_]{5,15}$";  // Matches 2 to 4 digits
	        Pattern pattern = Pattern.compile(regex);
	        String input = "hemant_123";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }


	}

}
