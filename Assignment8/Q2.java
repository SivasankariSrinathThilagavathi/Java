interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}
class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed via Credit Card.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed via Credit Card.");
    }
}
class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed via UPI.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refund of $" + amount + " processed via UPI.");
    }
}
public class Q2{
    public static void main(String[] args) {
        PaymentGateway creditCard = new CreditCardPayment();
        PaymentGateway upi = new UPIPayment();
        System.out.println("Credit Card Transactions:");
        creditCard.pay(250.75);
        creditCard.refund(50.25);
        System.out.println("\nUPI Transactions:");
        upi.pay(1000.00);
        upi.refund(200.00);
    }
}
