package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; // 2% per annum

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Application for ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        // Eligible if balance is at least ₹10,000
        return getBalance() >= 10000;
    }
}
