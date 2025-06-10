import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns (square matrix): ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];

        System.out.println("Enter the elements of the " + size + "x" + size + " matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        scanner.close();
    }
}
