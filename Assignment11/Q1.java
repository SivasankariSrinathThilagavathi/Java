import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();        
        scanner.close();        
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Normalize input
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
