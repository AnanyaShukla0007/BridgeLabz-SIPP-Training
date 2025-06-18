import java.util.Random;
public class StudentReport {
    public static void main(String[] args) {
        int students = 5;
        int[][] marks = new int[students][3];
        double[][] report = new double[students][3];
        Random r = new Random();

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = 50 + r.nextInt(50);
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;
            report[i][0] = total;
            report[i][1] = Math.round(avg * 100.0) / 100.0;
            report[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\t");
        for (int i = 0; i < students; i++) {
            System.out.print(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t");
            System.out.print(report[i][0] + "\t" + report[i][1] + "\t" + report[i][2]);
            System.out.println();
        }
    }
}
