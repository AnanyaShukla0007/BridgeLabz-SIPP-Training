package functionalInterface;
interface SensitiveDatas {}

class Employees implements SensitiveDatas {
    String name;
    String ssn;

    Employees(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}

public class SensitiveData {
    public static void main(String[] args) {
        Employees emp = new Employees("Rahul", "123-45-6789");

        if (emp instanceof SensitiveDatas) {
            System.out.println("Data is marked as sensitive. Apply encryption before storing.");
        } else {
            System.out.println("Normal data. No encryption required.");
        }
    }
}