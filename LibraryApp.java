package JavaProblems;

import java.util.*;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return this.title.equalsIgnoreCase(b.title) && this.author.equalsIgnoreCase(b.author);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

class BookShelf {
    Map<String, LinkedList<Book>> catalog;
    Set<Book> bookSet;

    BookShelf() {
        catalog = new HashMap<>();
        bookSet = new HashSet<>();
    }

    void addBook(String genre, Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Book already exists in the catalog: " + book);
            return;
        }

        if (!catalog.containsKey(genre)) {
            catalog.put(genre, new LinkedList<>());
        }

        catalog.get(genre).add(book);
        bookSet.add(book);
        System.out.println("Added book to genre [" + genre + "]: " + book);
    }

    void borrowBook(String genre, Book book) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found: " + genre);
            return;
        }

        LinkedList<Book> books = catalog.get(genre);
        if (!books.remove(book)) {
            System.out.println("Book not found in genre [" + genre + "]: " + book);
            return;
        }

        bookSet.remove(book);
        System.out.println("Book borrowed from genre [" + genre + "]: " + book);
    }

    void returnBook(String genre, Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Book already exists, can't return duplicate: " + book);
            return;
        }

        if (!catalog.containsKey(genre)) {
            catalog.put(genre, new LinkedList<>());
        }

        catalog.get(genre).add(book);
        bookSet.add(book);
        System.out.println("Book returned to genre [" + genre + "]: " + book);
    }

    void showCatalog() {
        System.out.println("\n📚 Library Catalog:");
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            LinkedList<Book> books = catalog.get(genre);
            for (Book book : books) {
                System.out.println("  - " + book);
            }
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien");

        shelf.addBook("Fantasy", b1);
        shelf.addBook("Fantasy", b2);
        shelf.addBook("Fantasy", b3);

        shelf.showCatalog();

        shelf.borrowBook("Fantasy", b1);
        shelf.showCatalog();

        shelf.returnBook("Fantasy", b1);
        shelf.returnBook("Fantasy", b1);
    }
}
