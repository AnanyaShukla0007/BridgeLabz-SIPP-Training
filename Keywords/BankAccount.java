class BankAccount {
    static String bankName = "GenZ Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alankrati", 101, 15000);
        acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}