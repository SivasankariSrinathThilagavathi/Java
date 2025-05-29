
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem10{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //10.fibo
        int x=1;
        int y=1;
        while (x<=100 || y<=100){
            System.out.print(x+"\t");
            if (y<=100){
            System.out.print(y+"\t");}
            x=x+y;
            y=x+y;
        }

    }
}
