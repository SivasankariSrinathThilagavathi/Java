import java.util.Scanner;

class Problem5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                System.out.print("Enter numerator: ");
                int a = sc.nextInt();
                System.out.print("Enter denominator: ");
                int b = sc.nextInt();
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("zero division error");
            }

            sc.nextLine(); 
            try {
                System.out.print("Enter a string : ");
                String s = sc.nextLine();
                if (s.isEmpty())
                    s = null;
                System.out.println("Length: " + s.length());
            } catch (NullPointerException e) {
                System.out.println("Null pointer error");
            }

        } catch (Exception e) {
            System.out.println("Outer exception");
        }
    }
}

