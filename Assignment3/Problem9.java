
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem9{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        //9.
        for(int num=2;num<21;num++){
        int c=0;
        for(int i=2;i<num;i++){
            if (num%i==0){
                //System.out.println("It is a composite number");
                c=c+1;
                break;
            }
        }
        if (c==0){
                System.out.println(num+" is a prime number");
            }
        }
       

    }
}
