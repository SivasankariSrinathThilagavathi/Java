class Account {
    private int accountNumber;       
    protected double balance;        
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
}
class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); 
        this.interestRate = interestRate;
    }
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " applied.");
    }
    public double getInterestRate() {
        return interestRate;
    }
}
class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);  
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal denied: exceeds overdraft limit.");
            return false;
        }
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Savings Account Demo");
        SavingsAccount sa = new SavingsAccount(1001, 5000.0, 4.5);
        sa.deposit(2000);
        sa.applyInterest();
        System.out.println("Current Balance (Savings): " + sa.getBalance());
        System.out.println();

        System.out.println("Current Account Demo");
        CurrentAccount ca = new CurrentAccount(2001, 3000.0, 1000.0);
        ca.deposit(500);
        ca.withdraw(3200);
        System.out.println("Current Balance (Current): " + ca.getBalance());
    }
}

