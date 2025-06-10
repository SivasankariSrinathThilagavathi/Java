import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a jagged array with different row sizes
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // Row 1 has 2 columns
        jaggedArray[1] = new int[3]; // Row 2 has 3 columns
        jaggedArray[2] = new int[4]; // Row 3 has 4 columns

        // Accept user input for the jagged array
        System.out.println("Enter elements for the jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Enter " + jaggedArray[i].length + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Display the jagged array
        System.out.println("Jagged array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }

        scanner.close();
    }
}
