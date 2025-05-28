//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem17{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //17.	WAP to find maximum between two numbers using switch statement.
        int n1;
        int n2;
        int n3;
        System.out.print("Enter a number: ");
        n1=ob.nextInt();
        System.out.print("Enter a number: ");
        n2=ob.nextInt();
        int res=n1>n2?1:0;
        switch (res){
            case 1: System.out.println(n1+" is greater than "+n2);
            case 0: System.out.println(n2+" is greater than "+n1);
        }
    }
}
