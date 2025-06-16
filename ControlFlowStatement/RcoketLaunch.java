import java.util.Scanner;
public class RcoketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        n++; // Increment n to account for the launch command
        while(n-->0){
            System.out.println(n);
        }
    }
}
