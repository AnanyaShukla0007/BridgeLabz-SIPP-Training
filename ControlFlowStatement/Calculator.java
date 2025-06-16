public class Calculator {
    public static void main(String[] args) {
        int a = 10; // Example input
        int b = 5;  // Example input
        String operation = "add"; // Example operation

        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Unknown operation");
        }
    }
}
