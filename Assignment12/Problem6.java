import java.util.Scanner;

class Customer {
    float balance = 0;

    void deposit(float amt) {
        balance += amt;
        System.out.println("Balance after deposit: " + balance);
    }

    void withdraw(float amt) {
        if (amt > balance)
            throw new ArithmeticException("Insufficient balance");
        balance -= amt;
        System.out.println("Balance after withdrawal: " + balance);
    }
}

class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();
        System.out.print("Enter amount to deposit: ");
        float d = sc.nextFloat();
        c.deposit(d);
        System.out.print("Enter amount to withdraw: ");
        float w = sc.nextFloat();
        try {
            c.withdraw(w);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
