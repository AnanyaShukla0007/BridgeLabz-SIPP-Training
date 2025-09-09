package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
	public static void main(String[] args) {
		 String regex = "https?://[^\\s,]+"; 
	        Pattern pattern = Pattern.compile(regex);
	        String input = "Visit https://www.google.com and http://example.org for more info.";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }

	}
}
