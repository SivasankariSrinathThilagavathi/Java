import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n + 1]; // Extra space for the new element

        // Accept array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Accept the new number and index
        System.out.print("Enter the number to insert: ");
        int newElement = scanner.nextInt();
        System.out.print("Enter the index to insert at (0 to " + n + "): ");
        int index = scanner.nextInt();

        // Validate index
        if (index < 0 || index > n) {
            System.out.println("Invalid index! Must be between 0 and " + n);
        } else {
            // Shift elements to make space for new element
            for (int i = n; i > index; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[index] = newElement; // Insert new element

            // Display updated array
            System.out.println("Updated array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
