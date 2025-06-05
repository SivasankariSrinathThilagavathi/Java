import java.util.Scanner;

class Person{
    String name;
    int age;
    Scanner sc=new Scanner(System.in);
    public void set_per_details(){
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter age: ");
        age=sc.nextInt();
    }
    public void get_per_details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Employee extends Person{
    String department;
    int empId;
    Scanner sc=new Scanner(System.in);
    public void set_emp_details(){
        set_per_details();
        System.out.print("Enter department: ");
        department=sc.next();
        System.out.print("Enter empId: ");
        empId=sc.nextInt();
    }
    public void get_emp_details(){
        get_per_details();
        System.out.println("department: "+department);
        System.out.println("empId: "+empId);
    }
}

class Salary extends Employee{
    double basicPay;
    double HRA;
    double DA;
    double salary;
    public void set_sal_details(){
        set_emp_details();
        System.out.print("Enter basic pay: ");
        basicPay=sc.nextDouble();
        System.out.print("Enter HRA: ");
        HRA=sc.nextDouble();
        System.out.print("Enter DA: ");
        DA=sc.nextDouble();
    }
    public void get_sal_details(){
        get_emp_details();
        System.out.println("basic pay: "+basicPay);
        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        System.out.println("Salary: "+salary);
    }
    public void calculateSalary(){
        salary=basicPay+HRA+DA;
    }
}

class Problem2{
    public static void main(String[] args) {
        Salary ob1=new Salary();
        Salary ob2=new Salary();
        ob1.set_sal_details();
        ob1.calculateSalary();
        ob1.get_sal_details();

    }
}
