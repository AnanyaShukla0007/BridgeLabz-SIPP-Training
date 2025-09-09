package functionalInterface;

interface PaymentProcessor {
 void processPayment(double amount);

 default void refund(double amount) {
     System.out.println("Refund of $" + amount + " is not supported by this provider.");
 }
}
class PayPalProcessor implements PaymentProcessor {
 public void processPayment(double amount) {
     System.out.println("Processing payment of $" + amount + " via PayPal.");
 }
}
class StripeProcessor implements PaymentProcessor {
 public void processPayment(double amount) {
     System.out.println("Processing payment of $" + amount + " via Stripe.");
 }

 @Override
 public void refund(double amount) {
     System.out.println("Refund of $" + amount + " processed via Stripe.");
 }
}

public class PaymentGatewayIntegration {
 public static void main(String[] args) {
     PaymentProcessor paypal = new PayPalProcessor();
     paypal.processPayment(100);
     paypal.refund(50);
     PaymentProcessor stripe = new StripeProcessor();
     stripe.processPayment(200);
     stripe.refund(100); 
 }
}
