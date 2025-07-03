package E_Commerce;
import java.util.*;
public class Main {
	public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        cart.add(new Electronics(101, "Smartphone", 30000));
        cart.add(new Clothing(201, "T-Shirt", 1500));
        cart.add(new Groceries(301, "Rice Bag", 1200));

        for (Product p : cart) {
            p.printFinalPrice();
        }
    }
}
