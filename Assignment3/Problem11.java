
import java.util.Scanner;

//Assignment3
//Sivasankari Srinath Thilagavathi

class Problem11{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        
        /*
        *  
        *	*  
        *	* *  
        *	* * *  
        *	* * * *  
        */
        int num;
        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=1;i<=num;i=i+1){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }        

        /*
        *	* * * *  
        *	* * *  
        *	* *  
        *	*  
        *  
        * 
        */

        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=num;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

        /*
        1  
        1 2  
        1 2 3  
        1 2 3 4  
        1 2 3 4 5 
        */
        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=1;i<=num;i=i+1){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println("");
        }    

        /*
        5 4 3 2 1  
        5 4 3 2  
        5 4 3  
        5 4 
        5  
        */
        
        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=num;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" "+j+" ");
            }
            System.out.println("");
        }        

        /*
        A  
        A B  
        A B C  
        A B C D  
        A B C D E 

        */
        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=1;i<=num;i=i+1){
            for(int j=1;j<=i;j++){
                char a= (char) (j+64);
                System.out.print(" "+a +" ");
            }
            System.out.println("");
        }    

        /*
        A B C D E 
          A B C D 
            A B C 
              A B 
                A 
        */
        
        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=num;i>0;i--){
            for (int k=0;k<(num-i);k++){
                    System.out.print("  ");
                }
            for(int j=i;j>0;j--){
                char a= (char) (j+64);
                System.out.print(" "+a);
            }
            System.out.println("");
        }   

        /*
        *  
        *	* * 
        *	* * * * 
        *	* * * * ** 
        *	* * * * ** * * 
        */
        System.out.print("Enter the number of rows for pattern: ");
        num=ob.nextInt();
        for (int i=1;i<=num;i=i+1){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }        

    }
}
