//ASSIGNMENT-1
//SIVASANKARI SRINATH THILAGAVATHI

import java.util.Scanner;

class Problem11{
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);

        //11.	WAP to enter marks of five students and calculate total marks, average marks and percentage.
        System.out.print("Enter marks of first student: ");
        float m1=ob.nextInt();
        System.out.print("Enter marks of second student: ");
        float m2=ob.nextInt();
        System.out.print("Enter marks of third student: ");
        float m3=ob.nextInt();
        System.out.print("Enter marks of fourth student: ");
        float m4=ob.nextInt();
        System.out.print("Enter marks of fifth student: ");
        float m5=ob.nextInt();
        float total=m1+m2+m3+m4+m5;
        float avg=total/5;
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+avg);
        System.out.println("Percentage: "+avg+"%");

    }
}
