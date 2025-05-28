//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem1{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        //1.	WAP to check a given number is even or odd. 
        int n;
        System.out.print("Enter the number: ");
        n=ob.nextInt();
        if (n %2==0) 
        System.out.println(n+" is even");
        else 
        System.out.println(n+" is odd");

    }
}
