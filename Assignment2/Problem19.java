//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem19{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
        //19. Accept a Grade and Print Description using switch

        char grade;

        System.out.print("Enter grade E, V, G, A, F: ");
        grade = ob.next().charAt(0);  

        switch (grade) {
            case 'E':
                System.out.println("Excellent");
                break;
            case 'V':
                System.out.println("Very Good");
                break;
            case 'G':
                System.out.println("Good");
                break;
            case 'A':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
    }
}
