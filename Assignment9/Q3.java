import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];        
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        scanner.close();
    }
}
