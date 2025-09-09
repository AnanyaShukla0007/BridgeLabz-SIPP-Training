
package generics;

import java.util.*;

interface Category {
    String getCategoryName();
}

class BookCategory implements Category {
    private String name;

    public BookCategory(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return "Book: " + name;
    }
}

class ClothingCategory implements Category {
    private String name;

    public ClothingCategory(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return "Clothing: " + name;
    }
}

class GadgetCategory implements Category {
    private String name;

    public GadgetCategory(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return "Gadget: " + name;
    }
}

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public T getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    public String getDetails() {
        return name + " | " + category.getCategoryName() + " | Price: ₹" + price;
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}

public class OnlineMarketApp {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 499.0, new BookCategory("Educational"));
        Product<ClothingCategory> shirt = new Product<>("Polo T-Shirt", 999.0, new ClothingCategory("Casual Wear"));
        Product<GadgetCategory> phone = new Product<>("Smartphone", 19999.0, new GadgetCategory("Electronics"));

        List<Product<? extends Category>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("Before Discount:");
        for (Product<? extends Category> p : catalog) {
            System.out.println(p.getDetails());
        }

        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 15);
        DiscountUtil.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        for (Product<? extends Category> p : catalog) {
            System.out.println(p.getDetails());
        }
    }
}
