import java.util.*;

public class StudentScoreCard {
    public static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 50 + r.nextInt(51);
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            grades[i] = p >= 90 ? "A" : p >= 75 ? "B" : p >= 60 ? "C" : p >= 50 ? "D" : "F";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] stats, String[] grades) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int) stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "\t");
            System.out.println(grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        display(scores, stats, grades);
    }
}
