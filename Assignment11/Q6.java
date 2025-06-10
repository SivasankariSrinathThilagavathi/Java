import java.util.Arrays;
public class Q6 {
    public static void main(String[] args) {
        String[] names = {"Michael", "Sarah", "John", "Alice", "David", "Emily"};
        Arrays.sort(names);
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
