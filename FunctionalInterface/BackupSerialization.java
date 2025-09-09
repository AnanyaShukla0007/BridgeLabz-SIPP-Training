package functionalInterface;
import java.io.*;

class UserData implements Serializable {
    String name;
    int age;

    UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BackupSerialization {
    public static void main(String[] args) {
        UserData user = new UserData("Hemant", 22);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.ser"))) {
            out.writeObject(user);
            System.out.println("Backup created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}