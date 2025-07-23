package JavaProblems;
import java.util.*;

public class BookShelf{
	private static ArrayList<String> bookList;
	
	public BookShelf() {
		bookList = new ArrayList<>();
	}
	
	public void addBookInput(String s) {
		if(!s.contains("-")) System.out.println("Invalid Input");
		String[] parts = s.split("-");
		if(parts.length != 2 ) System.out.println("Invalid Input");
		String book = parts[0].trim();
		String author = parts[1].trim();
		
		addBook(book, author);
	}
	
	void addBook(String book, String author) {
		bookList.add(book + " - " + author);
	}
	
	void sortBookAlphabetically() {
		int n = bookList.size();
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(bookList.get(j).compareTo(bookList.get(j+1)) > 0) {
					String temp1 = bookList.get(j);
					String temp2 = bookList.get(j+1);
					bookList.set(j, temp2);
					bookList.set(j+1, temp1);
				}
			}
		}
	}
	
	void searchByAuthor(String author) {
		String a1 = author.toLowerCase();
		boolean b = false;
		
		for(String s : bookList) {
			String[] parts = s.split("-");
			String a2 = parts[1].trim().toLowerCase();
			
			if(a1.equals(a2)) {
				System.out.println("found book by the author " + author + " - " + parts[0].trim());
				b = true;
				break;
			}
		}
		
		if(!b) System.out.println("No book Found!");
	}
	
	void displayBooks() {
		for(String s : bookList) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	static String[] export() {
		return bookList.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		BookShelf shelf = new BookShelf();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter books (type 'END' to stop): ");
	    while(true) {
	        String s = sc.nextLine();
	        if(s.equalsIgnoreCase("END")) break;
	        shelf.addBookInput(s);
	    }
		
		shelf.displayBooks();
		
		shelf.sortBookAlphabetically();
		shelf.displayBooks();
		
		System.out.println("Search by Author ; ");
		String author = sc.nextLine();
		shelf.searchByAuthor(author);
		
		String[] exported = export();
		System.out.println();
		System.out.println("Exported Array: ");
		for(String i : exported) {
			System.out.println(i);
		}
	}
}