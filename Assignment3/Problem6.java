
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem6{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        //6.
        int num;
        System.out.print("Enter the number: ");
        num = ob.nextInt();
        int num_orig = num;

        int c = 0;
        int temp = num;
        while (temp > 0) {
            c++;
            temp = temp / 10;
        }

        int num2 = 0;
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int p = 1;
            for (int i = 0; i < c; i++) {
                p *= digit;
            }
            num2 += p;
            temp = temp / 10;
        }

        if (num_orig == num2)
            System.out.println("Yes, it is an Armstrong number");
        else
            System.out.println("No, it is not an Armstrong number");
                

    }
}
