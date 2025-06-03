import java.util.Scanner;

class Books{
    String title;
    String author;
    int price;

    Books(){
        title="";
        author="";
        price=0;
    }

    Books(String name1){
        title=name1;
    }

    Books(String name1, String author1){
        title=name1;
        author=author1;
    }

    Books(String name1, String author1, int price1){
        title=name1;
        author=author1;
        price=price1;
    }

    public void show(){
        System.out.println("Title:\t"+title);
        System.out.println("Author:\t"+author);
        System.out.println("Price:\t"+price);
    }
}


class Problem4{
    public static void main(String[] args){
        Books ob1=new Books();
        ob1.show();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String name=obj.next();
        Books ob2=new Books(name);
        ob2.show();
        System.out.print("Enter Book Title: ");
        String name2=obj.next();
        System.out.print("Enter Author's name: ");
        String author2=obj.next();
        Books ob3=new Books(name2,author2);
        ob3.show();
        System.out.print("Enter Book Title: ");
        String name3=obj.next();
        System.out.print("Enter Author's name: ");
        String author3=obj.next();
        System.out.print("Enter Price: ");
        int dpt3=obj.nextInt();
        Books ob4=new Books(name3,author3,dpt3);
        ob4.show();

    }
}
