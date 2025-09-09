import java.io.*;

public class UserInfo {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
        
            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();


            String userInfo = "Name: " + name + "\n" +
                              "Age: " + age + "\n" +
                              "Favorite Language: " + language + "\n";

     
            writer = new FileWriter("user.txt");
            writer.write(userInfo);
            

            System.out.println("\nUser information saved to 'user.txt' successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
          
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.err.println("Failed to close resources: " + e.getMessage());
            }
        }
    }
}
