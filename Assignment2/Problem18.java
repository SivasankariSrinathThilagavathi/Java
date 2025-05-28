//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem18{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        int n;
        System.out.print("Enter a number: ");
        n = ob.nextInt();

        int result = (n>0)?1:(n<0?-1:0);

        switch (result) {
            case 1:
                System.out.println("Number is Positive");
                break;
            case -1:
                System.out.println("Number is Negative");
                break;
            case 0:
                System.out.println("Number is Zero");
                break;
        }


    }
}
