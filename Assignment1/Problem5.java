import java.util.Scanner;
class Problem5{
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);

        //5.	WAP to calculate the area of a circle.
        float pi=3.14f;
        System.out.print("Enter radius: ");
        float n1=ob.nextFloat();
        float area=pi*n1*n1;
        System.out.println("The area of circle is: "+area);}
}
