import java.util.Scanner;
class UniversityMember{
    String name;
    int id;
    Scanner sc=new Scanner(System.in);
    public void set_uni_details(){
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter id: ");
        id=sc.nextInt();
    }
    public void get_uni_details(){
        System.out.println("Member Name: "+name);
        System.out.println("Member id: "+id);
    }
}
class Student extends UniversityMember{
    String department;
    int Age;
    public void set_stud_details(){
        set_uni_details();
        System.out.print("Enter department: ");
        department=sc.next();
        System.out.print("Enter Age: ");
        Age=sc.nextInt();
    }
    public void get_stud_details(){
        get_uni_details();
        System.out.println("Member department: "+department);
        System.out.println("Member Age: "+Age);
    }
}
class Professor extends UniversityMember{
    String department;
    int Experience;
    public void set_prof_details(){
        set_uni_details();
        System.out.print("Enter department: ");
        department=sc.next();
        System.out.print("Enter Experience: ");
        Experience=sc.nextInt();
    }
    public void get_prof_details(){
        get_uni_details();
        System.out.println("Member department: "+department);
        System.out.println("Member Experience: "+Experience);
    }
}
class staff extends UniversityMember{
    String department;
    int Salary;
    public void set_staff_details(){
        set_uni_details();
        System.out.print("Enter department: ");
        department=sc.next();
        System.out.print("Enter Salary: ");
        Salary=sc.nextInt();
    }
    public void get_staff_details(){
        get_uni_details();
        System.out.println("Member department: "+department);
        System.out.println("Member Salary: "+Salary);
    }
}
class Problem3{
    public static void main(String[] args) {
        Student ob1=new Student();
        ob1.set_stud_details();
        ob1.get_stud_details();
        Professor ob2 = new Professor();
        ob2.set_prof_details();
        ob2.get_prof_details();
        staff ob3= new staff();
        ob3.set_staff_details();
        ob3.get_staff_details();
    }
}

