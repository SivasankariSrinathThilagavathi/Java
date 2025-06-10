import java.util.Scanner;
import java.util.LinkedHashSet;
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int num : numbers) {
            uniqueElements.add(num);
        }
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
