import java.util.Scanner;

class Problem14{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        // 14. WAP to perform operation according to user choice using switch
        int n1, n2;
        char op;

        System.out.print("Enter the first number: ");
        n1 = ob.nextInt();

        System.out.print("Enter the second number: ");
        n2 = ob.nextInt();

        System.out.println("Choose operation: +  -  *  / ");
        System.out.print("Enter operator: ");
        op = ob.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + (n1 + n2));
                break;
            case '-':
                System.out.println("Result: " + (n1 - n2));
                break;
            case '*':
                System.out.println("Result: " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Result: " + (n1 / n2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

    }
}
