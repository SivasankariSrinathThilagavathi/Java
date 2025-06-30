import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18)
                throw new InvalidAgeException("Not eligible to vote");
            System.out.println("Eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
