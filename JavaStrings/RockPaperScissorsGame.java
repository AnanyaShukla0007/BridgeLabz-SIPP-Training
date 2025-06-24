import java.util.*;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[(int)(Math.random() * 3)];
    }

    public static String getResult(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Round " + i + " - Enter rock, paper or scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String result = getResult(user, comp);
            System.out.println("Computer chose: " + comp + " → " + result + " wins");
            if (result.equals("User")) userWins++;
            else if (result.equals("Computer")) compWins++;
            else draws++;
        }

        System.out.println("\nResults:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.println("User Win %: " + (userWins * 100.0 / n));
        System.out.println("Computer Win %: " + (compWins * 100.0 / n));
    }
}
