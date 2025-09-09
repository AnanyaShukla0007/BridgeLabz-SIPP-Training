package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchCapitalized {
	public static void main(String[] args) {
		 String regex = "\\b[A-Z][a-z]*\\b"; 
	        Pattern pattern = Pattern.compile(regex);
	        String input = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }

	}
}
