import java.util.Scanner;
import java.util.InputMismatchException;

class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0)
                throw new ArithmeticException("Cannot compute square root of negative number");
            System.out.println("Square Root: " + Math.sqrt(num));
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid integer");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution completed");
        }
    }
}
