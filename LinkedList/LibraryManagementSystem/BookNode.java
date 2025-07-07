package LinkedList.LibraryManagementSystem;

class BookNode {
    String title;
    String author;
    String genre;
    String bookId;
    boolean isAvailable;

    BookNode next, prev;

    public BookNode(String title, String author, String genre, String bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

