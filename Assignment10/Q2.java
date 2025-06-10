import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        int sum = 0;

        // Accept elements for the 2D array
        System.out.println("Enter the elements of the " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
                sum += array[i][j]; // Add each element to sum
            }
        }

        // Print the sum of all elements
        System.out.println("Sum of all elements in the matrix: " + sum);

        scanner.close();
    }
}
