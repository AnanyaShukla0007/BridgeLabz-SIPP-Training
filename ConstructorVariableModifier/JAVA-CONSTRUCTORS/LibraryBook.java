public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            System.out.println("You have successfully borrowed " + title);
            available = false;
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Available: " + available);
    }
}