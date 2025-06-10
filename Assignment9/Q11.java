import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        if (n < 2) {
            System.out.println("At least two elements are required!");
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : numbers) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element found (all elements are the same).");
            } else {
                System.out.println("Second largest element: " + secondLargest);
            }
        }
        scanner.close();
    }
}
