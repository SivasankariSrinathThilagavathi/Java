
import java.util.Scanner;

class Problem6{
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);

        //6.	WAP to find the cube of a number.
        System.out.print("Enter number: ");
        int n1=ob.nextInt();
        int cube=n1*n1*n1;
        System.out.println("The cube of"+n1+" is: "+cube);}
}
