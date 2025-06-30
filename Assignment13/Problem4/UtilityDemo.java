import utils.StringUtils;
import utils.MathUtils;
import utils.ValidationUtils;

public class UtilityDemo {
    public static void main(String[] args) {
        System.out.println("=== String Utils ===");
        String str = "madam";
        System.out.println("Reverse: " + StringUtils.reverse(str));
        System.out.println("Is Palindrome: " + StringUtils.isPalindrome(str));
        System.out.println("Title Case: " + StringUtils.toTitleCase("hello world from java"));

        System.out.println("\n=== Math Utils ===");
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("Is 17 prime? " + MathUtils.isPrime(17));
        System.out.println("GCD of 24 and 36: " + MathUtils.gcd(24, 36));

        System.out.println("\n=== Validation Utils ===");
        System.out.println("Valid Email: " + ValidationUtils.isValidEmail("user@example.com"));
        System.out.println("Is Numeric: " + ValidationUtils.isNumeric("1234.56"));
        System.out.println("Valid Phone: " + ValidationUtils.isValidPhone("9876543210"));
    }
}
