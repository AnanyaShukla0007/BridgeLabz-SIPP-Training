class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void showBookDetails() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-123456", "Shadow Games", "Ihli");
        ebook.showEBookDetails();
    }
}
