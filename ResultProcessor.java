package JavaProblems;
import java.util.*;

public class ResultProcessor {
    static String[] correctAns = {"class", "new", "false", "final", ".java"};
    static List<Integer> scoreList = new ArrayList<>();

    void compareAnswers(String[] userAns) {
        int right = 0, wrong = 0;

        for (int i = 0; i < correctAns.length; i++) {
            if (userAns[i].equalsIgnoreCase(correctAns[i])) {
                right++;
            } else {
                wrong++;
            }
        }

        calculateScore(right);
        char grade = calculateGrade(right);
        System.out.println("Grade: " + grade);
    }

    void calculateScore(int r) {
        System.out.println("Your Score is " + r + " out of " + 5);
        scoreList.add(r);
    }

    char calculateGrade(int r) {
        if (r >= 4) return 'A';
        else if (r > 3) return 'B';
        else if (r > 2) return 'C';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ResultProcessor processor = new ResultProcessor();

        String[] questions = {
            "What keyword is used to define a class in Java?",
            "Which keyword is used to create an object in Java?",
            "What is the default value of a boolean variable in Java?",
            "Which keyword prevents inheritance in Java?",
            "What is the file extension for a Java source file?"
        };

        System.out.print("How many number of students are giving the quiz? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + ", please answer the questions:");
            String[] userAns = new String[5];

            for (int j = 0; j < 5; j++) {
                System.out.println(questions[j]);
                userAns[j] = sc.nextLine().trim();
            }

            processor.compareAnswers(userAns);
        }

        System.out.println("\nAll Scores: " + scoreList);
    }
}
