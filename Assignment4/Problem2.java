//problem2
import java.util.Scanner;
class Employee{
    int empID;
    String empName;
    int deptID;
    String bloodGroup;
    float salary;
    Scanner ob=new Scanner(System.in);
    public void setEmployeeDetails(){
        System.out.print("Enter the employee ID: ");
        empID=ob.nextInt();
        System.out.print("Enter the employee name: ");
        empName=ob.next();
        System.out.print("Enter the department ID: ");
        deptID=ob.nextInt();
        System.out.print("Enter the blood group: ");
        bloodGroup=ob.next();
        System.out.print("Enter the Salary: ");
        salary=ob.nextFloat();
    }
    public void getEmployeeDetails(){
        System.out.println("Employee ID: "+empID);
        System.out.println("Employee name: "+empName);
        System.out.println("Department ID: "+deptID);
        System.out.println("Blood group: "+bloodGroup);
        System.out.println("Salary: "+salary);
    }
}

class Problem2{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmployeeDetails();
        e1.getEmployeeDetails();
    }
}
