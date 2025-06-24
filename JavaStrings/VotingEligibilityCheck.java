import java.util.*;

public class VotingEligibilityCheck {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(50) + 1;
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] data = checkEligibility(ages);
        display(data);
    }
}
