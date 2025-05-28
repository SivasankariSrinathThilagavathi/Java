//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem6{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        //6.	WAP to take input of character and check it is vowel or consonant using switch.
        char a;
        System.out.print("Enter a letter: ");
        a=ob.next().charAt(0);
        switch(a){
            case 'a': 
            System.out.println(a+" is a vowel");
            break;
            case 'e': 
            System.out.println(a+" is a vowel");
            break;
            case 'i': 
            System.out.println(a+" is a vowel");
            break;
            case 'o': 
            System.out.println(a+" is a vowel");
            break;
            case 'u': 
            System.out.println(a+" is a vowel");
            break;
            default:
            System.out.println(a+" is a consonant");
        }

    }
}
