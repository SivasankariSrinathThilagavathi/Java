//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem7{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        //7.    WAP to take input of 5 subject marks and display the grade 
        float grade;
        System.out.print("Enter Marks: ");
        grade=ob.nextFloat();
        if (grade>=90) System.out.println("Grade: A+");
        else if (grade>=80) System.out.println("Grade: A");
        else if (grade>=70) System.out.println("Grade: B+");
        else if (grade>=60) System.out.println("Grade: B");
        else if (grade>=50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");


    }
}
