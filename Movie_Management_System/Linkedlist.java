package LinkedList.Movie_Management_System;

public class Linkedlist {
    Movie head = null, tail = null;

    
    // Add at beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position (0-based index)
    public void addAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 0) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        Movie newNode = new Movie(title, director, year, rating);
        Movie temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Remove by title
    public void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;

                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;

                System.out.println("Movie '" + title + "' removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie '" + title + "' not found.");
    }

    // Search by director
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }

    // Search by rating
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating: " + rating);
    }

    // Display forward
    public void displayForward() {
        Movie temp = head;
        if (temp == null) {
            System.out.println("Movie list is empty.");
            return;
        }
        System.out.println("\nMovies (Forward):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    public void displayReverse() {
        Movie temp = tail;
        if (temp == null) {
            System.out.println("Movie list is empty.");
            return;
        }
        System.out.println("\nMovies (Reverse):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Update rating by title
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for movie: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie '" + title + "' not found.");
    }

    // Utility: print a movie node
    private void displayMovie(Movie node) {
        System.out.println("Title: " + node.title +
                ", Director: " + node.director +
                ", Year: " + node.year +
                ", Rating: " + node.rating);
    }
}

