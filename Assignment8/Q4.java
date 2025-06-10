final class University {
    private String name;
    private String location;
    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public void displayInfo() {
        System.out.println("University Name: " + name);
        System.out.println("Location: " + location);
    }
}
public class Q4 {
    public static void main(String[] args) {
        University uni = new University("Tech University", "New York");
        uni.displayInfo();
    }
}
