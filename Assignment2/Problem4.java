//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem4{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //4.    WAP to find the largest number among three numbers using conditional operator. 
        int n1;
        int n2;
        int n3;
        System.out.print("Enter the first number: ");
        n1=ob.nextInt();
        System.out.print("Enter the second number: ");
        n2=ob.nextInt();
        System.out.print("Enter the third number: ");
        n3=ob.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println(n1+" is the greatest of the 3.");
        }
        if (n2>n1 && n2>n3){
            System.out.println(n1+" is the greatest of the 3.");
        }
        if (n3>n1 && n3>n2){
            System.out.println(n1+" is the greatest of the 3.");
        }
        else{
            System.out.println("None is the greatest");
        } 
        
    }
}
