class Customer {
    int customerId;
    String customerName;
    Customer(int id, String name) {
        customerId = id;
        customerName = name;
    }
    void displayCustomerInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}
class Billing extends Customer {
    double billAmount;
    Billing(int id, String name, double amount) {
        super(id, name); 
        billAmount = amount;
    }
    void calculateDiscount() {
        double discount = (billAmount > 1000) ? billAmount * 0.1 : billAmount * 0.05;
        double finalAmount = billAmount - discount;
        super.displayCustomerInfo();
        System.out.println("Original Bill Amount: " + billAmount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
public class Problem4 {
    public static void main(String[] args) {
        Billing bill = new Billing(101, "Ananya Singh", 1250.0);
        bill.calculateDiscount();
    }
}
