import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the " + rows + "x" + cols + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == searchElement) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found in the matrix.");
        }
        scanner.close();
    }
}
