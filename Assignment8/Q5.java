class BankAccount {
    final void generateAccountNumber() {
        System.out.println("Generating unique account number...");
    }
}
class SavingsAccount extends BankAccount {
    // Attempting to override final method (will cause a compilation error)
    /*
    void generateAccountNumber() {
        System.out.println("Generating savings account number...");
    }
    */
}
public class Q5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.generateAccountNumber();
    }
}
