import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display the elements of the array
        System.out.println("The entered numbers are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
