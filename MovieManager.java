package JavaProblems;
import java.util.*;

public class MovieManager {
	static List<String> movieTitles = new ArrayList<>();
	static List<String> movieShowtimes = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nCinemaTime – Movie Schedule Manager");
			System.out.println("1. Add Movie");
			System.out.println("2. Search Movie");
			System.out.println("3. View All Movies");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.print("\nEnter movie title: ");
					String title = sc.nextLine();
					System.out.print("\nEnter showtime: ");
					String time = sc.nextLine();
					addMovie(title, time);
					break;

				case 2:
					System.out.print("\nEnter keyword to search: ");
					String keyword = sc.nextLine();
					searchMovie(keyword);
					break;

				case 3:
					displayAllMovies();
					break;

				case 4:
					System.out.println("Goodbye!");
					return;

				default:
					System.out.println("Invalid option.");
			}
		}
	}

	public static void addMovie(String title, String time) {
		movieTitles.add(title);
		movieShowtimes.add(time);
		System.out.println("Movie added successfully!");
	}

	public static void searchMovie(String keyword) {
		boolean found = false;
		for (int i = 0; i < movieTitles.size(); i++) {
			if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
				System.out.println(String.format("🎬 %s - Showtime: %s", movieTitles.get(i), movieShowtimes.get(i)));
				found = true;
			}
		}
		if (!found) System.out.println("No matching movies found.");
	}

	public static void displayAllMovies() {
		if (movieTitles.isEmpty()) {
			System.out.println("No movies scheduled.");
			return;
		}

		String[] titlesArray = movieTitles.toArray(new String[0]);
		String[] timesArray = movieShowtimes.toArray(new String[0]);

		System.out.println("\n🎥 Movie Schedule:");
		for (int i = 0; i < titlesArray.length; i++) {
			System.out.println(String.format("%d. %s - Showtime: %s", (i + 1), titlesArray[i], timesArray[i]));
		}
	}
}
