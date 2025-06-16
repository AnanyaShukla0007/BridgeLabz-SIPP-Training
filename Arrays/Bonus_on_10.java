package Arrays;

import java.util.Scanner;

public class Bonus_on_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMPLOYEES = 10;

        double[][] employeeData = new double[EMPLOYEES][2];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            double salary;
            do {
                System.out.print("Enter salary: ");
                salary = sc.nextDouble();
                if (salary <= 0) {
                    System.out.println("Salary must be positive. Please enter again.");
                }
            } while (salary <= 0);

            double yearsOfService;
            do {
                System.out.print("Enter years of service: ");
                yearsOfService = sc.nextDouble();
                if (yearsOfService < 0) {
                    System.out.println("Years of service cannot be negative. Please enter again.");
                }
            } while (yearsOfService < 0);

            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        for (int i = 0; i < EMPLOYEES; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];

            double employeeBonus;
            if (yearsOfService > 5) {
                employeeBonus = 0.05 * salary;
            } else {
                employeeBonus = 0.02 * salary;
            }

            double updatedSalary = salary + employeeBonus;

            bonus[i] = employeeBonus;
            newSalary[i] = updatedSalary;

            totalBonus += employeeBonus;
            totalOldSalary += salary;
            totalNewSalary += updatedSalary;
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("Employee | Old Salary | Bonus     | New Salary");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("%4d     | %.2f    | %.2f    | %.2f\n",
                    (i + 1), employeeData[i][0], bonus[i], newSalary[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}
