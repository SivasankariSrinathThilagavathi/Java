package college.admin;

public class Admin {
    private String name;
    private int adminId;

    public Admin(String name, int adminId) {
        this.name = name;
        this.adminId = adminId;
    }

    public void displayDetails() {
        System.out.println("Admin Name: " + name);
        System.out.println("Admin ID: " + adminId);
    }
}
