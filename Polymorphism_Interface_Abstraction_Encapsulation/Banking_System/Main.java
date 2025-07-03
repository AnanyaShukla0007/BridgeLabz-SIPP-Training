package BankingSystem;
import java.lang.ref.Cleaner.Cleanable;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV123", "Divyansh Singh", 6000);
        BankAccount acc2 = new CurrentAccount("CUR456", "Aryan Mehta", 15000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            double interest = acc.calculateInterest();
            System.out.println("Annual Interest: ₹" + interest);

            if (acc instanceof Lonable) {
                Lonable loanable = (Lonable) acc;
                loanable.applyForLoan(20000);
                System.out.println("Loan Eligibility: " + (loanable.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }

            System.out.println("------------------------------------");
        }
    }
}

