package Fundamentals;

public class ProfitandLoss {
	public static void main(String args[]) {
		double cp=129;
		double sp=191;
		
		double profit=sp-cp;
		double profitper=(profit)/cp*100;
		
		System.out.println("CP and SP are "+cp+" "+sp);
		System.out.println("Profit Percentage: "+profitper);
	}
}
