import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class EmployeeSerialization {
    private static final String FILE_NAME = "employees.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        try {
           
            System.out.print("Enter number of employees: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for employee " + (i + 1));
                System.out.print("ID: ");
                int id = Integer.parseInt(scanner.nextLine());

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Department: ");
                String department = scanner.nextLine();

                System.out.print("Salary: ");
                double salary = Double.parseDouble(scanner.nextLine());

                employeeList.add(new Employee(id, name, department, salary));
            }

  
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(employeeList);
            oos.close();
            System.out.println("\nEmployees have been serialized to " + FILE_NAME);


            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            List<Employee> deserializedList = (List<Employee>) ois.readObject();
            ois.close();

            System.out.println("\nDeserialized Employees:");
            for (Employee emp : deserializedList) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
