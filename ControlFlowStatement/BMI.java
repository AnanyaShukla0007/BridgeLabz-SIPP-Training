class BMI{
    public static void main(String[] args) {
        double weight = 70.0; // in kg
        double height = 1.75; // in meters

        // Calculate BMI
        double bmi = weight / (height * height);

        // Print the result
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Determine the category
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}