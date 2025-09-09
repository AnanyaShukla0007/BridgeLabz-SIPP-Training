import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
     
        String sourcePath = "E:\\BRAJLAB\\Java Programs\\InputStream\\file1.txt";
        String destinationPath = "E:\\BRAJLAB\\Java Programs\\InputStream\\file2.txt";

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

   
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist: " + sourcePath);
            return;
        }

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

         
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file operation: " + e.getMessage());
        }
    }
}
