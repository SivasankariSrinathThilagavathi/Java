import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];
        int sum = 0;

        // Accept 8 integers from the user
        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Compute sum
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Display sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
