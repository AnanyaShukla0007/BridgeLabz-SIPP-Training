package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmail {
	public static void main(String[] args) {
		 String regex = "\\b[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}\\b"; 
	        Pattern pattern = Pattern.compile(regex);
	        String input = "Contact us at support@example.com and info@company.org";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }

	}
}
