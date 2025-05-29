
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem2{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //2.    WAP to find the sum of all the digits of a given number.
        int num;
        System.out.print("Enter the number: ");
        num=ob.nextInt();
        int sum=0;
        while (num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("The sum of digits is: "+sum);        

    }
}
