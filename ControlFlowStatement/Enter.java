import java.util.Scanner;
public class Enter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        while(true){
            int n=scanner.nextInt();
            if(n==0) break;
            sum += n;
        }
        System.out.println(sum);
    }
    
}