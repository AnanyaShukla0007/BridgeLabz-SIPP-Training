package Arrays;

import java.util.Scanner;
public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int sum=0;
        for(int i:height){
            sum+=i;
        }
        System.out.println("Mean height is "+sum/n);
    }
}
