package LinkedList.Movie_Management_System;

public class Main {
    public static void main(String[] args) {
        Linkedlist mms = new Linkedlist();

        mms.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        mms.addAtPosition("Interstellar", "Christopher Nolan", 2014, 8.6, 1);

        mms.displayForward();
        mms.displayReverse();

        mms.searchByDirector("Christopher Nolan");
        mms.searchByRating(8.6);

        mms.updateRating("Interstellar", 9.0);
        mms.displayForward();

        mms.removeByTitle("The Godfather");
        mms.displayForward();
    }
}
