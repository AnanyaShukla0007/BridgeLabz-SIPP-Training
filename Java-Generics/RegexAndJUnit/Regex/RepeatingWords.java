package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RepeatingWords {
	public static void main(String[] args) {
		 String regex = "\\b(\\w+)\\b\\s+\\1\\b"; 
	        Pattern pattern = Pattern.compile(regex);
	        String input = "this this is is a repeated  repeated  word test.";
	        
	        Matcher matcher = pattern.matcher(input);
	        
	        while (matcher.find()) {
	            System.out.println("Matched: " + matcher.group(1));
	        }

	}
}

