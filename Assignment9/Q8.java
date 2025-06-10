import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[7];        
        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }        
        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
