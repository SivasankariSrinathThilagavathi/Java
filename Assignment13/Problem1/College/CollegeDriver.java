package college;

import college.students.Student;
import college.faculty.Faculty;
import college.admin.Admin;

public class CollegeDriver {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1001);
        Faculty faculty = new Faculty("Dr. Strange", 2001);
        Admin admin = new Admin("Tony Stark", 3001);

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nFaculty Details:");
        faculty.displayDetails();

        System.out.println("\nAdmin Details:");
        admin.displayDetails();
    }
}
