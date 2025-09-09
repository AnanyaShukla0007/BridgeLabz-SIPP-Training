package regex;

public class CreditCard {
	 public static void main(String[] args) {
	        String[] testCards = {
	            "4123456789012345",  
	            "5123456789012345",  
	            "6123456789012345",  
	            "41234567890123",    
	            "51234567890123456"  
	        };

	        for (String card : testCards) {
	            System.out.printf("%s : %s%n", card, isValidCard(card) ? "Valid" : "Invalid");
	        }
	    }

	    public static boolean isValidCard(String number) {
	        return number.matches("^(4\\d{15}|5\\d{15})$");
	    }
}
