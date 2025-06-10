import java.util.Scanner;
import java.util.HashSet;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicateElements = new HashSet<>();

        // Accept 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            // Check for duplicates
            if (!uniqueElements.add(numbers[i])) {
                duplicateElements.add(numbers[i]);
            }
        }

        // Display duplicate elements
        if (!duplicateElements.isEmpty()) {
            System.out.println("Duplicate elements found:");
            for (int num : duplicateElements) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No duplicate elements found.");
        }

        scanner.close();
    }
}
