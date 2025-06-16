package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Factors_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        int ans[]=new int[count];
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans[k]=i;
                k++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
