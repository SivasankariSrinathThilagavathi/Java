//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem11{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);

        //11.	WAP to check whether an input character is an alphabet, digit or special character.
        char ch;
        System.out.print("Enter Character: ");
        ch=ob.next().charAt(0);
        int num= (int) ch;

        if (num>=65 && num<91 || num>=97 && num<123){
            System.out.println(ch+" is an alphabet");
        }
        else if (num>=48 && num<=57){
            System.out.println(ch+" is a digit");
        }
        else{
            System.out.println(ch+" is a special character");
        }
        

    }
}
