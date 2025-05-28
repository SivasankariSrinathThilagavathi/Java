//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem16{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        
        //16.	WAP to find number of days in a month using switch statement.
        int month;
        System.out.print("Enter month number: ");
        month=ob.nextInt();
        switch(month){
            case 1: System.out.println("31 days"); break;
            case 2: System.out.println("28/29 days"); break;
            case 3: System.out.println("31 days"); break;
            case 4: System.out.println("30 days"); break;
            case 5: System.out.println("31 days"); break;
            case 6: System.out.println("30 days"); break;
            case 7: System.out.println("31 days"); break;
            case 8: System.out.println("31 days"); break;
            case 9: System.out.println("30 days"); break;
            case 10: System.out.println("31 days"); break;
            case 11: System.out.println("30 days"); break;
            case 12: System.out.println("31 days"); break;
            default: System.out.println("Enter valid month number");
        }

    }
}
