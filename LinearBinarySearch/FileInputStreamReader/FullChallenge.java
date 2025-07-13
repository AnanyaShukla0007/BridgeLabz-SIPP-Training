import java.io.*;
import java.util.*;

public class FullChallenge {
    public static void main(String[] args) throws IOException {
        long start, end;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) sb.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start));

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) sbf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start));

        FileReader fr = new FileReader("bigfile.txt");
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.trim().split("\\s+").length;
        }
        br.close();
        System.out.println("FileReader words: " + wordCount);

        InputStreamReader isr = new InputStreamReader(new FileInputStream("bigfile.txt"), "UTF-8");
        br = new BufferedReader(isr);
        wordCount = 0;
        while ((line = br.readLine()) != null) {
            wordCount += line.trim().split("\\s+").length;
        }
        br.close();
        System.out.println("InputStreamReader words: " + wordCount);
    }
}
