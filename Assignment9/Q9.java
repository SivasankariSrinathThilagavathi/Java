import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] mergedArray = new int[10];

        // Accept first array from the user
        System.out.println("Enter 5 elements for the first array:");
        for (int i = 0; i < 5; i++) {
            array1[i] = scanner.nextInt();
        }

        // Accept second array from the user
        System.out.println("Enter 5 elements for the second array:");
        for (int i = 0; i < 5; i++) {
            array2[i] = scanner.nextInt();
        }

        // Merge the two arrays
        for (int i = 0; i < 5; i++) {
            mergedArray[i] = array1[i];
            mergedArray[i + 5] = array2[i];
        }

        // Display the merged array
        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
