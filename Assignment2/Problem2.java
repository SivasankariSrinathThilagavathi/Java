//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Assignment2{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //2.	 WAP to find larger number among two numbers.
        int n1;
        int n2;
        System.out.print("Enter the first number: ");
        n1=ob.nextInt();
        System.out.print("Enter the second number: ");
        n2=ob.nextInt();
        int res=(n1>n2)?n1:n2;
        System.out.println(res+" is greater");

    }
}
