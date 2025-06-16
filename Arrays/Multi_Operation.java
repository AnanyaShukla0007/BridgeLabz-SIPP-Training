package Arrays;
import java.util.Scanner;
public class Multi_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i:arr){
            if(i<0){
                System.out.println(i+" is is negative");
            }
            else if(i==0){
                System.out.println(i+" is zero");
            }
            else{
                System.out.println(i+" is positive");
            }
            if(i%2==0){
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+" is odd");
            }
        }
        int a=arr[0],b=arr[arr.length-1];
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
    }
}
