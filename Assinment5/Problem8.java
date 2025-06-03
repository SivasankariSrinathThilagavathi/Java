import java.util.Scanner;

class Movies{
    String title;
    String genre;
    int year;

    Movies(){
        title="";
        genre="";
        year=0;
    }

    Movies(String name1){
        title=name1;
    }

    Movies(String name1, String genre1){
        title=name1;
        genre=genre1;
    }

    Movies(String name1, String genre1, int year1){
        title=name1;
        genre=genre1;
        year=year1;
    }

    public void show(){
        System.out.println("Title:\t"+title);
        System.out.println("Genre:\t"+genre);
        System.out.println("Year:\t"+year);
    }
}


class Problem8{
    public static void main(String[] args){
        Movies ob1=new Movies();
        ob1.show();
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Movie Title: ");
        String name=obj.next();
        Movies ob2=new Movies(name);
        ob2.show();
        System.out.print("Enter Movie Title: ");
        String name2=obj.next();
        System.out.print("Enter Genre: ");
        String genre2=obj.next();
        Movies ob3=new Movies(name2,genre2);
        ob3.show();
        System.out.print("Enter Movie Title: ");
        String name3=obj.next();
        System.out.print("Enter Genre: ");
        String genre3=obj.next();
        System.out.print("Enter Year: ");
        int dpt3=obj.nextInt();
        Movies ob4=new Movies(name3,genre3,dpt3);
        ob4.show();

    }
}
