package Arrays;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int count = 0;
        while (t != 0) {
            count++;
            t /= 10;
        }
        int arr[] = new int[count];
        int k = 0;
        t = n;
        while (t != 0) {
            arr[k++] = t % 10;
            t = t / 10;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            System.out.println("Frequency of "+i+" is "+map.get(i));
        }
    }
}
