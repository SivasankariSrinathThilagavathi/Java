
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem3{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //3.    WAP to check a given number is palindrome or not. ( If reverse of a number and number is same, then it is called palindrome). 
        int num;
        System.out.print("Enter the number: ");
        num=ob.nextInt();
        int num_orig=num;
        int num_rev=0;
        while (num>0){
            num_rev=num_rev*10+(num%10);
            num=num/10;
        }        
        System.out.println("The reversed number is: "+num_rev);
        int bool=num_rev==num_orig?1:0;
        switch (bool){
            case 0:
                System.out.println("No, it is not a palindrome");
                break;
            case 1:
                System.out.println("Yes, it is a palindrome");
                break;
        }        

    }
}
