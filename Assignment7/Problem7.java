
import java.util.Scanner;
class LibraryItem{
    String title;
    int year;
    String Publisher;
    Scanner sc=new Scanner(System.in);
    public void set_lib_details(){
        System.out.print("Enter Title: ");
        title=sc.next();
        System.out.print("Enter year: ");
        year=sc.nextInt();
        System.out.print("Enter Publisher: ");
        Publisher=sc.next();
    }
    public void get_lib_details(){
        System.out.println("Title: "+title);
        System.out.println("year: "+year);
        System.out.println("Publisher: "+Publisher);
    }
}
class Book extends LibraryItem{
    String Author;
    int Price;
    public void set_Book_details(){
        set_lib_details();
        System.out.print("Enter Author: ");
        Author=sc.next();
        System.out.print("Enter Price: ");
        Price=sc.nextInt();
    }
    public void get_Book_details(){
        get_lib_details();
        System.out.println("Author: "+Author);
        System.out.println("Price: "+Price);
    }
}

class Magazine extends LibraryItem{
    String date;
    int Price;
    public void set_Magazine_details(){
        set_lib_details();
        System.out.print("Enter date: ");
        date=sc.next();
        System.out.print("Enter Price: ");
        Price=sc.nextInt();
    }
    public void get_Magazine_details(){
        get_lib_details();
        System.out.println("date: "+date);
        System.out.println("Price: "+Price);
    }
}

class Newspaper extends LibraryItem{
    String date;
    int Price;
    public void set_Newspaper_details(){
        set_lib_details();
        System.out.print("Enter date: ");
        date=sc.next();
        System.out.print("Enter Price: ");
        Price=sc.nextInt();
    }
    public void get_Newspaper_details(){
        get_lib_details();
        System.out.println("date: "+date);
        System.out.println("Price: "+Price);
    }
}
class Problem7{
    public static void main(String[] args) {
        Book ob1=new Book();
        ob1.set_lib_details();
        ob1.get_lib_details();
        Magazine ob2 = new Magazine();
        ob2.set_Magazine_details();
        ob2.get_Magazine_details();
        Newspaper ob3= new Newspaper();
        ob3.set_Newspaper_details();
        ob3.get_Newspaper_details();
    }
}

