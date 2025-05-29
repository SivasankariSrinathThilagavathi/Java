
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem1{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //1.    WAP to find factorial of a given number.
        int num;
        System.out.print("Enter the number: ");
        num=ob.nextInt();
        int prod=1;
        int i;
        for (i=1;i<=num;i=i+1){
            prod=prod*i;

        }
        System.out.println("The factorial of "+num+" is: "+prod);
        
    }
}
