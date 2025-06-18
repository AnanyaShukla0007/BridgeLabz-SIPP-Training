import java.util.Random;
public class BonusCalculator {
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] data = new double[10][4]; // salary, service, bonus, new salary
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // salary
            data[i][1] = rand.nextInt(11); // service
            data[i][2] = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            data[i][3] = data[i][0] + data[i][2];

            totalOld += data[i][0];
            totalBonus += data[i][2];
            totalNew += data[i][3];
        }

        System.out.println("Salary\tService\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f\n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }

        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }
}
