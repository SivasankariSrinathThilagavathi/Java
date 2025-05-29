
    import java.util.Scanner;

    class Student{
        Scanner ob=new Scanner(System.in);
        int roll;
        String name;
        float mark1;
        float mark2;
        float mark3;
        float total;
        float avg;
        public void gettotal(){
            total=mark1+mark2+mark3;
            avg=total/3;
            System.out.println("Total marks: "+total);
        }
        public void displaydata(){
            System.out.println("Name: "+name);
            System.out.println("Roll number: "+roll);
            System.out.println("Total marks: "+total);
            System.out.println("Average marks: "+avg);
            System.out.println("marks - 1: "+mark1);
            System.out.println("marks - 2: "+mark2);
            System.out.println("marks - 3: "+mark3);
        }
        public void getdata(){
            System.out.print("Enter Name: ");
            name=ob.next();
            System.out.print("Enter Roll number: ");
            roll=ob.nextInt();
            System.out.print("Enter marks - 1: ");
            mark1=ob.nextFloat();
            System.out.print("Enter marks - 2: ");
            mark2=ob.nextFloat();
            System.out.print("Enter marks - 3: ");
            mark3=ob.nextFloat();

        }

    }

    class Problem1{
        public static void main(String[] args) {
            Student st1=new Student();
            st1.getdata();
            st1.displaydata();
            st1.gettotal();


        }
    }
