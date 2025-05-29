//problem3

import java.util.Scanner;

class Area{
    float pi=3.14f;
    public void areaOfCircle(){
        Scanner ob=new Scanner(System.in);
        float r;
        System.out.print("Enter the radius of the Circle: ");
        r=ob.nextFloat();
        float area=pi*r*r;
        System.out.println("The area of the circle is: "+area);
    }
    public void areaOfCyclinder(){
        Scanner ob=new Scanner(System.in);
        float r;
        System.out.print("Enter the radius of the Cylinder: ");
        r=ob.nextFloat();
        float h;
        System.out.print("Enter the height of the Cylinder: ");
        h=ob.nextFloat();
        float area=2*pi*r*(r+h);
        System.out.println("The area of the cylinder is: "+area);
    }
}

class Problem3{
    public static void main(String[] args) {
        Area circle1=new Area();
        circle1.areaOfCircle();
        Area cyl1= new Area();
        cyl1.areaOfCyclinder();
    }
}
