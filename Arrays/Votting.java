package Arrays;

import java.util.*;

public class Votting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[10];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " can vote");
            }
        }
    }
}
