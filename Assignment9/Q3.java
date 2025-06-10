import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        // Accept 6 integers from the user
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max variables
        int min = numbers[0];
        int max = numbers[0];

        // Find min and max values
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Display the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}
