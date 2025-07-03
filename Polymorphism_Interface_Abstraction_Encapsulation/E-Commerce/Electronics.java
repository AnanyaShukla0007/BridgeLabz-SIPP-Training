package E_Commerce;

public class Electronics extends Product implements Taxable {
	  public Electronics(int productId, String name, double price) {
	        super(productId, name, price);
	    }

	    @Override
	    public double calculateDiscount() {
	        return getPrice() * 0.10; // 10% discount
	    }

	    @Override
	    public double calculateTax() {
	        return getPrice() * 0.18; // 18% GST
	    }

	    @Override
	    public String getTaxDetails() {
	        return "Electronics Tax: 18% GST";
	    }

}
