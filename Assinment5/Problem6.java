import java.util.Scanner;

class Employee{
    int empid;
    String empname;
    int salary;

    Employee(){
        empid=0;
        empname="";
        salary=0;
    }

    Employee(int empid1){
        empid=empid1;
    }

    Employee(int empid1, String empname1){
        empid=empid1;
        empname=empname1;
    }

    Employee(int empid1, String empname1, int sal1){
        empid=empid1;
        empname=empname1;
        salary=sal1;
    }

    public void show(){
        System.out.println("Emp ID:\t"+empid);
        System.out.println("Emp Name:\t"+empname);
        System.out.println("Emp Salary:\t"+salary);
    }
}

class Problem6{
    public static void main(String[] args){
        Employee ob1=new Employee();
        ob1.show();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empid=obj.nextInt();
        Employee ob2=new Employee(empid);
        ob2.show();
        System.out.print("Enter Employee ID: ");
        int empid2=obj.nextInt();
        System.out.print("Enter employee name: ");
        String empname2=obj.next();
        Employee ob3=new Employee(empid2,empname2);
        ob3.show();
        System.out.print("Enter Employee ID: ");
        int empid3=obj.nextInt();
        System.out.print("Enter employee name: ");
        String empname3=obj.next();
        System.out.print("Enter Salary: ");
        int dpt3=obj.nextInt();
        Employee ob4=new Employee(empid3,empname3,dpt3);
        ob4.show();

    }
}
