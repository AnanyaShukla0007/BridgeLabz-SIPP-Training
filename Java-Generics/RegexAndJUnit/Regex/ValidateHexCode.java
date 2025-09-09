package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexCode {
	public static void main(String[] args) {
		 String regex = "^[#][0-9A-Fa-f]{6}$"; 
	        Pattern pattern = Pattern.compile(regex);
	        String input = "#1A2B3f";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        if (matcher.find()) {
	            System.out.println("Matched: " + matcher.group());
	        }


	}
}
