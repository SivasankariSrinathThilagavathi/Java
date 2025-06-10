import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n + 1]; 
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }        
        System.out.print("Enter the number to insert: ");
        int newElement = scanner.nextInt();
        System.out.print("Enter the index to insert at (0 to " + n + "): ");
        int index = scanner.nextInt();
        if (index < 0 || index > n) {
            System.out.println("Invalid index! Must be between 0 and " + n);
        } else {           
            for (int i = n; i > index; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[index] = newElement; 
            System.out.println("Updated array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}
