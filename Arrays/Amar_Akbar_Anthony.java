package Arrays;
import java.util.Scanner;
public class Amar_Akbar_Anthony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age_height[][] = new int[3][2];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++) {
                age_height[i][j] = sc.nextInt();
            }
        int min_age = Math.min(age_height[0][0],Math.min(age_height[1][0],age_height[2][0]));
        int max_height=Math.max(age_height[0][1],Math.max(age_height[1][1],age_height[2][1]));

        System.out.println("Minimum age:"+min_age);
        System.out.println("Maximum age:"+max_height);
    }
}
