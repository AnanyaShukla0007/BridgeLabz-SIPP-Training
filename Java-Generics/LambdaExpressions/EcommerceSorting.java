import java.util.*;

class Products {
    String name;
    double price;
    double rating;
    double discount;

    Products(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();
        products.add(new Products("Laptop", 800, 4.5, 10));
        products.add(new Products("Phone", 500, 4.7, 20));
        products.add(new Products("Headphones", 100, 4.2, 15));

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating)); 
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount)); // Highest discount first
        products.forEach(System.out::println);
    }
}