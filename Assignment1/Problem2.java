import java.util.Scanner;
class Problem2{
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);

        //2.	WAP to add, subtract two numbers with or without there corresponding operator.

        System.out.print("Enter first number: ");
        int n1=ob.nextInt();
        System.out.print("Enter second number: ");
        int n2=ob.nextInt();

        //With:
        int sum1=n1+n2;
        int diff1=n1-n2;
        System.out.println("The sum is: "+sum1);
        System.out.println("The difference is: "+diff1);

        //Without:
        int sum2=n1+n2;
        int diff2=n1-n2;
        System.out.println("The sum is: "+sum2);
        System.out.println("The difference is: "+diff2);  }
}
