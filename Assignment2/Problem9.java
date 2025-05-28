//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem9{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //9.	WAP to check whether an input number is single digit, two digit or three digit.
        float num;
        System.out.print("Enter the number: ");
        num=ob.nextFloat();
        if (num>=100) System.out.println(num+" is of 3 digits");
        else if (num>=10) System.out.println(num+" is of 2 digits");
        else System.out.println(num+" is of 1 digit");

    }
}
