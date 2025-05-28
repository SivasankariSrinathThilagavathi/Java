//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem10{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //10.	WAP to input the age of a candidate and determine whether it is eligible for casting his/her own vote or not.
        int age;
        System.out.print("Enter Candidate Age: ");
        age=ob.nextInt();
        if (age>=18) System.out.println("The candidate can vote");
        else System.out.println("The candidate cannot vote");


    }
}
