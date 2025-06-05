class BankAccount{
    int acc_num;
    String acc_name;
    double balance=0;
    BankAccount(){
        acc_num=0;
        acc_name="";
    }
    BankAccount(int x){
        acc_num=x;
    }
    BankAccount(int y,String x){
        acc_name=x;
        acc_num=y;
    }

    public void deposit(int x){
        balance+=x;
        System.out.println("You have deposited: "+x+" Rupees\tTotal Bank Balance: "+balance);
    }

    public void deposit(double x){
        balance+=x;
        System.out.println("You have deposited: "+x+" Rupees\tTotal Bank Balance: "+balance);
    }

    public void withdraw(int x){
        balance-=x;
        System.out.println("You have withdrawed: "+x+" Rupees\tTotal Bank Balance: "+balance);
    }

    public void withdraw(double x){
        balance-=x;
        System.out.println("You have withdrawed: "+x+" Rupees\tTotal Bank Balance: "+balance);
        }
}

class Problem9{
    public static void main(String[] args) {
        BankAccount ob=new BankAccount(1234,"Bob J.");
        ob.deposit(1000);
        ob.deposit(1000.5);
        ob.withdraw(500);
        ob.withdraw(500.5);
    }
}
