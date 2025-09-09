import java.io.*;
import java.nio.charset.StandardCharsets;

public class UpperToLowerFileConverter {
    public static void main(String[] args) {
        String inputFile = "D:\\BJLab\\BridgeLab-SIPP-Training-2215001017\\InputStream\\file1.txt";
        String outputFile = "D:\\BJLab\\BridgeLab-SIPP-Training-2215001017\\InputStream\\file2.txt";

        try (

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {

                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File has been converted to lowercase and written to " + outputFile);

        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }
}
