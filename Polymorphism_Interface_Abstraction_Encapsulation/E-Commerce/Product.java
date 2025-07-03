package E_Commerce;

public abstract class Product {
	
	    private int productId;
	    private String name;
	    private double price;

	    // Constructor
	    public Product(int productId, String name, double price) {
	        this.productId = productId;
	        this.name = name;
	        this.price = price;
	    }

	    // Getters
	    public int getProductId() { return productId; }
	    public String getName() { return name; }
	    public double getPrice() { return price; }

	    // Setters (Encapsulation)
	    public void setName(String name) { this.name = name; }
	    public void setPrice(double price) { this.price = price; }

	    // Abstract method
	    public abstract double calculateDiscount();

	    // Final price = price + tax - discount
	    public double getFinalPrice() {
	        double tax = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
	        return price + tax - calculateDiscount();
	    }

	    public void printFinalPrice() {
	        System.out.printf("Product: %s | Final Price: ₹%.2f%n", name, getFinalPrice());
	    }
	}
