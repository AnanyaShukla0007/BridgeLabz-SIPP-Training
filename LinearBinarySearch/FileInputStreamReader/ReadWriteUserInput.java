import java.io.*;

public class ReadWriteUserInput {
    public static void writeUserInput(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        String line;
        while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}