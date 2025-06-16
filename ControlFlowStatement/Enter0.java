public class Enter0 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            sum += n;
        }
        System.out.println(sum);
    }
    
}
