//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem5{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //5.	 WAP to take input of character and check it is vowel or consonant.

        char a;
        System.out.print("Enter a letter: ");
        a=ob.next().charAt(0);
        if (a == 'a'|| a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println(a+" is a vowel");
        }
        else{
            System.out.println(a+" is a consonant");
        }

    }
}
