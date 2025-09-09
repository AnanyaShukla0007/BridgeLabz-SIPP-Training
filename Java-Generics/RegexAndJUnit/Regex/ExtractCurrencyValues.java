package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractCurrencyValues {
	public static void main(String[] args) {
		 String regex = "\\$?\\d+(\\.\\d{2})?"; 
	        Pattern pattern = Pattern.compile(regex);
	        String input = "The price is $45.99, and the discount is 10.50.";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }

	}
}
