class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 50000, 3.5);
        sa.displayAccountType();
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accNo, double balance, double limit) {
        super(accNo, balance);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount("CA123", 30000, 20000);
        ca.displayAccountType();
    }
}

class FixedDepositAccount extends BankAccount {
    int termInMonths;

    FixedDepositAccount(String accNo, double balance, int term) {
        super(accNo, balance);
        this.termInMonths = term;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    public static void main(String[] args) {
        FixedDepositAccount fda = new FixedDepositAccount("FD123", 100000, 12);
        fda.displayAccountType();
    }
}
