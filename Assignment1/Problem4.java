import java.util.Scanner;
class Problem4{
    public static void main(String[] args) {

        //4.	WAP to swap two values without using third variable.
        System.out.print("Enter first number: ");
        int n1=ob.nextInt();
        System.out.print("Enter second number: ");
        int n2=ob.nextInt();
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("The numbers have been swapped!");
        System.out.println("Now first number is: "+n1);
        System.out.println("Now second number is: "+n2);
}
