
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem5{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
       //5. 	WAP to find y to the power of x .  
        int y;
        System.out.print("Enter the base: ");
        y=ob.nextInt();
        int x;
        int prod=1;
        System.out.print("Enter the exponent: ");
        x=ob.nextInt();
        for(int i=0; i<x;i++){
            prod=prod*y;
        }
        System.out.println("Result: "+prod);        

    }
}
