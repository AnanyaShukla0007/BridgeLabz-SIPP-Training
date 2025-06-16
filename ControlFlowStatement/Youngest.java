import java.util.Scanner;
class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amar= sc.nextInt();
        int akbar = sc.nextInt();
        int anthony = sc.nextInt();
        int youngest = Math.min(amar, Math.min(akbar, anthony));
        if (youngest == amar) {
            System.out.println("Amar");
        } else if (youngest == akbar) {
            System.out.println("Akbar");
        } else {
            System.out.println("Anthony");
        }
    }
}