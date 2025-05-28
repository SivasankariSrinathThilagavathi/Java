//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem15{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //15.	WAP to read weekday number and print weekday name using switch statement.
        int day_num;
        System.out.print("Enter day number with sunday as 0: ");
        day_num=ob.nextInt();
        switch (day_num){
            case 0: System.out.println("It is a Sunday"); break;
            case 1: System.out.println("It is a Monday"); break;
            case 2: System.out.println("It is a Tuesday"); break;
            case 3: System.out.println("It is a Wednesday"); break;
            case 4: System.out.println("It is a Thursday"); break;
            case 5: System.out.println("It is a Friday"); break;
            case 6: System.out.println("It is a Saturday"); break;
            default: System.out.println("Enter valid day number");
        }

    }
}
