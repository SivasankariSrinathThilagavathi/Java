//Assignment2
//SIVASANKARI SRINATH THILAGAVATHI
import java.util.Scanner;
class Problem20{
    public static void main(String[] args) {
        
        Scanner ob=new Scanner(System.in);
       
        //20.	Create a Menu-Driven Program to compute the area of the various geometrical shape.(like circle, rectangle, rectangle etc)
        String shape;
        System.out.print("Enter a shape - Circle or Rectangle or Square: ");
        shape=ob.next();
        float area;
        switch (shape){
            case "Circle": System.out.print("Enter the radius: ");
                float r=ob.nextFloat();
                area=3.14f*r*r;
                System.out.println("The area of the circle is: "+area);
                break;
            case "Rectangle": System.out.print("Enter the base: ");
                float a=ob.nextFloat();
                System.out.print("Enter the height: ");
                float b=ob.nextFloat();    
                area=a*b;
                System.out.println("The area of the rectangle is: "+area);
                break;
            case "Square": System.out.print("Enter the side: ");
                float x=ob.nextFloat();
                area=x*x;
                System.out.println("The area of the square is: "+area);
                break;
            default: System.out.println("Check Spelling or invalid shape");

        }
    }
}
