//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem13{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //13.   WAP to check whether a triangle is Equilateral, Isosceles or Scalene.
        float l1;
        float l2;
        float l3;
        System.out.print("Enter first side: ");
        l1=ob.nextFloat();
        System.out.print("Enter second side: ");
        l2=ob.nextFloat();
        System.out.print("Enter third side: ");
        l3=ob.nextFloat();
        if (l1==l2 && l2==l3) System.out.println("They form an equilateral triangle");
        else if(l1==2 || l2==l3 || l1==l3) System.out.println("They form an isosceles triangle");
        else System.out.println("They form a scalene triangle");

    }
}
