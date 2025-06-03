import java.util.Scanner;

class Student{
    String name;
    int age;
    String dpt;

    Student(){
        name="";
        age=0;
        dpt=null;
    }

    Student(String name1){
        name=name1;
    }

    Student(String name1, int age1){
        name=name1;
        age=age1;
    }

    Student(String name1, int age1, String dpt1){
        name=name1;
        age=age1;
        dpt=dpt1;
    }

    public void show(){
        System.out.println("Name:\t"+name);
        System.out.println("Age:\t"+age);
        System.out.println("Department:\t"+dpt);
    }
}


class Problem2{
    public static void main(String[] args){
        Student ob1=new Student();
        ob1.show();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=obj.next();
        Student ob2=new Student(name);
        ob2.show();
        System.out.print("Enter your name: ");
        String name2=obj.next();
        System.out.print("Enter your age: ");
        int age2=obj.nextInt();
        Student ob3=new Student(name2,age2);
        ob3.show();
        System.out.print("Enter your name: ");
        String name3=obj.next();
        System.out.print("Enter your age: ");
        int age3=obj.nextInt();
        System.out.print("Enter your department: ");
        String dpt3=obj.next();
        Student ob4=new Student(name3,age3,dpt3);
        ob4.show();

    }
}
