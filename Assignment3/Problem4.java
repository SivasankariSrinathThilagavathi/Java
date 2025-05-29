
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem4{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //4.    WAP to check a given number is prime number or not.  
        int num;
        System.out.print("Enter the number: ");
        num=ob.nextInt();
        int c=0;
        for(int i=2;i<num;i++){
            if (num%i==0){
                System.out.println("It is a composite number");
                c=c+1;
                break;
            }
        }
        if (c==0){
                System.out.println("It is a prime number");
            }
                

    }
}
