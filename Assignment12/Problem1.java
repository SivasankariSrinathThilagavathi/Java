import java.util.Scanner;
class Problem1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            float a = sc.nextFloat();
            System.out.print("Enter a number: ");
            float b = sc.nextFloat();
            float result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
