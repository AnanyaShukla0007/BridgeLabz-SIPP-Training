package Arrays;
import java.util.Scanner;
public class Digits_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        int count=0;
        while(t!=0){
            count++;
            t/=10;
        }
        int arr[]=new int[count];
        int k=0;
        t=n;
        while(t!=0){
            arr[k++]=t%10;
            t=t/10;
        }
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }
        }
        System.out.println("Largest digit:"+max);
        System.out.println("Second Largest digit:"+max2);
    }
}
