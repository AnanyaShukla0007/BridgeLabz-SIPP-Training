package LinkedList.LibraryManagementSystem;

public class LibrarySystem {
    private BookNode head;
    private BookNode tail;
    private int count = 0;

    // Add at beginning
    public void addBookAtBeginning(String title, String author, String genre, String bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }

    // Add at end
    public void addBookAtEnd(String title, String author, String genre, String bookId, boolean isAvailable) {
        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        count++;
    }

    // Add at specific position (1-based index)
    public void addBookAtPosition(String title, String author, String genre, String bookId, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        } else if (position > count) {
            addBookAtEnd(title, author, genre, bookId, isAvailable);
            return;
        }

        BookNode newNode = new BookNode(title, author, genre, bookId, isAvailable);
        BookNode current = head;

        for (int i = 1; i < position - 1; i++) current = current.next;

        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;

        count++;
    }

    // Remove book by Book ID
    public void removeBookById(String bookId) {
        if (head == null) return;

        BookNode current = head;
        while (current != null && !current.bookId.equals(bookId)) {
            current = current.next;
        }

        if (current == null) return;

        if (current == head) head = current.next;
        if (current == tail) tail = current.prev;

        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;

        count--;
    }

    // Update availability by Book ID
    public void updateAvailability(String bookId, boolean isAvailable) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId.equals(bookId)) {
                current.isAvailable = isAvailable;
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID not found.");
    }

    // Search by Book Title
    public void searchByTitle(String title) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                displayBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No book found with title: " + title);
    }

    // Search by Author
    public void searchByAuthor(String author) {
        BookNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                displayBook(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No books found by author: " + author);
    }

    // Display all books (forward)
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode current = head;
        System.out.println("Books in Library (Forward Order):");
        while (current != null) {
            displayBook(current);
            current = current.next;
        }
    }

    // Display all books (reverse)
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }
        BookNode current = tail;
        System.out.println("Books in Library (Reverse Order):");
        while (current != null) {
            displayBook(current);
            current = current.prev;
        }
    }

    // Count total books
    public int countBooks() {
        return count;
    }

    // Display a book's details
    private void displayBook(BookNode book) {
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", Genre: " + book.genre +
                ", ID: " + book.bookId + ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}

