import java.io.*;
import java.util.Scanner;

public class StudentDataStream {
    private static final String FILE_NAME = "students.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            System.out.print("Enter number of students: ");
            int count = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < count; i++) {
                System.out.println("Enter details for student " + (i + 1));
                System.out.print("Roll Number: ");
                int roll = Integer.parseInt(scanner.nextLine());

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("GPA: ");
                double gpa = Double.parseDouble(scanner.nextLine());

   
                dos.writeInt(roll);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
            }

            System.out.println("\nStudent details written successfully to '" + FILE_NAME + "'.\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("Reading student details from file:");
            int studentCount = 1;

            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Student " + studentCount++);
                System.out.println("Roll Number: " + roll);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
    }
}
