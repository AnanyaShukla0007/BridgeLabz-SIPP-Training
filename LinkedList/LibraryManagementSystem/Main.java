package LinkedList.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        // Add books
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", "B001", true);
        library.addBookAtBeginning("The Hobbit", "J.R.R. Tolkien", "Fantasy", "B002", true);
        library.addBookAtPosition("The Alchemist", "Paulo Coelho", "Fiction", "B003", true, 2);

        // Display
        library.displayForward();
        System.out.println("Total Books: " + library.countBooks());

        // Search
        System.out.println("\nSearch by Title:");
        library.searchByTitle("1984");

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Paulo Coelho");

        // Update availability
        System.out.println("\nUpdating availability of B003 to false:");
        library.updateAvailability("B003", false);
        library.displayForward();

        // Remove
        System.out.println("\nRemoving book with ID B002:");
        library.removeBookById("B002");
        library.displayForward();

        // Reverse display
        System.out.println("\nDisplay in Reverse Order:");
        library.displayReverse();

        System.out.println("Final Book Count: " + library.countBooks());
    }
}

