import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " numbers:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}
