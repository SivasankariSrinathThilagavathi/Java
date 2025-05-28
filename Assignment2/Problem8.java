//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem8{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //8.	WAP to check whether an input year is a leap year or not.
        int year;
        System.out.print("Enter the year: ");
        year=ob.nextInt();
        if ((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }

 
    }
}
