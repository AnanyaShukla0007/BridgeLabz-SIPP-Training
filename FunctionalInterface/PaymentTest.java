interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via UPI."); }
}

class CreditCard implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Credit Card."); }
}

class Wallet implements Payment {
    public void pay(double amount) { System.out.println("Paid " + amount + " via Wallet."); }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment creditCard = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay(500);
        creditCard.pay(1200);
        wallet.pay(300);
    }
}
