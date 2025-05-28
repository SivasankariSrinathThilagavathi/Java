//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem12{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //12.	WAP to check whether a triangle can be formed by the given value for the angles.
        float angle0;
        float angle1;
        float angle2;
        System.out.print("Enter first angle: ");
        angle0=ob.nextFloat();
        System.out.print("Enter second angle: ");
        angle1=ob.nextFloat();
        System.out.print("Enter third angle: ");
        angle2=ob.nextFloat();
        if (angle0+angle1+angle2 ==180) System.out.println("yes, it forms a triangle");
        else System.out.println("no, it does not form a triangle");


    }
}
