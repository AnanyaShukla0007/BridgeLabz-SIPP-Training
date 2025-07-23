package JavaProblems;

import java.util.*;

class ReportCard {
    String name;
    int[] marks = new int[3]; 
    boolean[] validMarks = new boolean[3];
    double average;
    char grade;

    void inputData(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            int m = sc.nextInt();
            if (m >= 0 && m <= 100) {
                marks[i] = m;
                validMarks[i] = true;
            } else {
                marks[i] = -1; 
                validMarks[i] = false;
            }
        }

        sc.nextLine(); 
    }

    void calculateKnowledge() {
        int total = 0;
        int count = 0;

        for (int i = 0; i < marks.length; i++) {
            if (validMarks[i]) {
                total += marks[i];
                count++;
            }
        }

        average = (count == 0) ? 0 : (double) total / count;

        if (average >= 85) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 50) grade = 'C';
        else grade = 'D';
    }

    void displayResult() {
        for (int i = 0; i < marks.length; i++) {
            if (validMarks[i])
                System.out.print(marks[i] + " ");
            else
                System.out.println("Invalid");
        }
        System.out.printf(average + " " + grade);
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ReportCard[] students = new ReportCard[n];

        for (int i = 0; i < n; i++) {
            students[i] = new ReportCard();
            students[i].inputData(sc);
            students[i].calculateKnowledge();
        }
        
        for (ReportCard s : students) {
            s.displayResult();
        }

    }
}