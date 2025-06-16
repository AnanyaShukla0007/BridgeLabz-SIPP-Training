package Arrays;
import java.util.*;

public class Odd_EvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int cnt_odd = 0, cnt_even = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                cnt_even++;
            }
            else{
                cnt_odd++;
            }
        }
        int arr_odd[]=new int[cnt_odd];
        int arr_eve[]=new int[cnt_even];
        int odd=0,even=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                arr_eve[even++]=i;
            }
            else{
                arr_odd[odd++]=i;
            }
        }
        System.out.println("Odd array elements are"+Arrays.toString(arr_odd));
        System.out.println("Even array elements are"+Arrays.toString(arr_eve));
    }
}
