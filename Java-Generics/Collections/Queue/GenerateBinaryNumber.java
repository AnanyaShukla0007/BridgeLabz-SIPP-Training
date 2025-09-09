package queue;



import java.io.*;
import java.util.*;

public class GenerateBinaryNumbers {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the value of N: ");
        int N = Integer.parseInt(br.readLine());

        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < N; i++) {
            String curr = q.remove();
            result.add(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }

        System.out.println("\nFirst " + N + " binary numbers:");
        System.out.println(result);
        System.out.println(q);
    }
}