import java.io.*;

public class LargeFileReadingComparison {
    public static void readUsingFileReader(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        while (br.readLine() != null) {}
        br.close();
    }

    public static void readUsingInputStreamReader(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        while (br.readLine() != null) {}
        br.close();
    }

    public static void main(String[] args) throws IOException {
        String path = "largefile.txt";

        long start = System.nanoTime();
        readUsingFileReader(path);
        long end = System.nanoTime();
        System.out.println("FileReader: " + (end - start) / 1e6 + "ms");

        start = System.nanoTime();
        readUsingInputStreamReader(path);
        end = System.nanoTime();
        System.out.println("InputStreamReader: " + (end - start) / 1e6 + "ms");
    }
}
