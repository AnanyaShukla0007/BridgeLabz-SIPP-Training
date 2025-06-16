package Arrays;
import java .util.*;
public class Infinite_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            int x=sc.nextInt();
            if(x<=0)break;
            arr[i]=x;
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
