package Arrays;

import java.util.*;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];


        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");


            double weight;
            do {
                System.out.print("Enter weight in kg: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight <= 0);


            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height <= 0);


            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;


            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }


        System.out.println("\n----------------------------------------");
        System.out.println("Height(m)  Weight(kg)  BMI       Status");
        System.out.println("----------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t   %.2f\t   %.2f\t%s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
