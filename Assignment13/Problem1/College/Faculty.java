package college.faculty;

public class Faculty {
    private String name;
    private int facultyId;

    public Faculty(String name, int facultyId) {
        this.name = name;
        this.facultyId = facultyId;
    }

    public void displayDetails() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
    }
}
