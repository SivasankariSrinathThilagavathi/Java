import java.sql.*;
import java.util.Scanner;

//java -cp ".;mysql-connector-j-9.3.0.jar" Admin
//javac -cp ".;mysql-connector-j-9.3.0.jar" tria.java

class Admin{
    static final String URL = "jdbc:mysql://localhost:3306/BDS";
    static final String USER = "root"; 
    static final String PASS = "pass";    
    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            int choice;

            do {
                System.out.println("\n========= Admin Panel =========");
                System.out.println("1. Manage Manager Accounts");
                System.out.println("2. Manage Employee Accounts");
                System.out.println("3. View All Projects");
                System.out.println("4. View All Bug Reports");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> managerMenu();
                    case 2 -> employeeMenu();
                    case 3 -> viewAllProjects();
                    case 4 -> viewBugReports();
                    case 5 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice!");
                }
            } while (choice!=5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ================= MANAGER MENU ====================
    public static void managerMenu() throws SQLException {
        System.out.println("\n----- Manager Menu -----");
        System.out.println("1. Add Manager Account");
        System.out.println("2. View Managers");
        System.out.println("3. Delete Manager Account");
        System.out.println("4. Update Manager Details");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1 -> addEmployee("Manager");
            case 2 -> viewEmployeesByRole("Manager");
            case 3 -> deleteEmployee("Manager");
            case 4 -> updateEmployeeDetails("Manager");
            default -> System.out.println("Invalid option");
        }
    }

    // ================= EMPLOYEE MENU ====================
    public static void employeeMenu() throws SQLException {
        System.out.println("\n----- Employeeee Menu -----");
        System.out.println("1. Add Employee Account");
        System.out.println("2. View Employees");
        System.out.println("3. Delete Employee Account");
        System.out.println("4. Update Employee Details");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Role(Tester/Developer/Admin): ");
        String role = sc.nextLine();
        switch (ch) {
            case 1 -> addEmployee(role);  
            case 2 -> viewEmployeesByRole(role);
            case 3 -> deleteEmployee(role);
            case 4 -> updateEmployeeDetails(role);
            default -> System.out.println("Invalid option");
        }
    }

    // ================= ADD EMPLOYEE ====================
    public static void addEmployee(String role) throws SQLException {
        System.out.print("Enter empCode: ");
        int empCode = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter DOB: ");
        String dob = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        long mobile = sc.nextLong(); sc.nextLine();
        
        PreparedStatement pst = con.prepareStatement(
            "INSERT INTO Employee (empCode, empName, empEmail, empPassword, gender, DOB, mobileNo, Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
        );
        pst.setInt(1, empCode);
        pst.setString(2, name);
        pst.setString(3, email);
        pst.setString(4, password);
        pst.setString(5, gender);
        pst.setString(6, dob);
        pst.setLong(7, mobile);
        pst.setString(8, role);
        pst.executeUpdate();

        System.out.println(role + " added successfully.");
    }

    // ================= VIEW EMPLOYEES BY ROLE ====================
    public static void viewEmployeesByRole(String role) throws SQLException {
        PreparedStatement pst = con.prepareStatement("SELECT * FROM Employee WHERE Role = ?");
        pst.setString(1, role);
        ResultSet rs = pst.executeQuery();

        System.out.println("\n" + role.toUpperCase() + " LIST:");
        while (rs.next()) {
            System.out.println("Code: " + rs.getInt("empCode") + ", Name: " + rs.getString("empName") + ", Email: " + rs.getString("empEmail")+ ", Mobile No.: " + rs.getString("mobileNo"));
        }
    }

    // ================= DELETE EMPLOYEE ====================
    public static void deleteEmployee(String role) throws SQLException {
        System.out.print("Enter empCode to delete: ");
        int code = sc.nextInt();
        PreparedStatement pst = con.prepareStatement("DELETE FROM Employee WHERE empCode = ? AND Role = ?");
        pst.setInt(1, code);
        pst.setString(2, role);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? role + " deleted." : "Employee not found.");
    }

    // ================= UPDATE EMPLOYEE ====================
    public static void updateEmployeeDetails(String role) throws SQLException {
        System.out.print("Enter empCode to update: ");
        int code = sc.nextInt(); sc.nextLine();
        System.out.print("Enter new Email: ");
        String email = sc.nextLine();
        System.out.print("Enter new Mobile No: ");
        long mobile = sc.nextLong(); sc.nextLine();

        PreparedStatement pst = con.prepareStatement("UPDATE Employee SET empEmail = ?, mobileNo = ? WHERE empCode = ? AND Role = ?");
        pst.setString(1, email);
        pst.setLong(2, mobile);
        pst.setInt(3, code);
        pst.setString(4, role);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Updated successfully." : "Employee not found.");
    }

    // ================= VIEW PROJECTS ====================
    public static void viewAllProjects() throws SQLException {
        System.out.println("\n--- All Projects ---");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Project");

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("projectID") +
                               ", Name: " + rs.getString("projectName") +
                               ", Start: " + rs.getString("SDate") +
                               ", End: " + rs.getString("EDate") +
                               ", Desc: " + rs.getString("projectDec"));
        }
    }

    // ================= VIEW BUG REPORTS ====================
    public static void viewBugReports() throws SQLException {
        System.out.println("\n--- Bug Reports ---");

        String query = """
            SELECT br.bugNo, bt.bugCatgory, bt.bugSeverty, br.status, br.bugDes, br.projectID
            FROM BugReport br
            JOIN BugType bt ON br.bugCode = bt.bugCode
            """;

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("Bug No: " + rs.getInt("bugNo") +
                               ", Category: " + rs.getString("bugCatgory") +
                               ", Severity: " + rs.getString("bugSeverty") +
                               ", Status: " + rs.getString("status") +
                               ", Desc: " + rs.getString("bugDes") +
                               ", Project ID: " + rs.getInt("projectID"));
        }
    }
}
// ***************************************************************************Manager Module starts here********************************************************************
class Manager{
    static final String URL = "jdbc:mysql://localhost:3306/BDS";
    static final String USER = "root"; 
    static final String PASS = "RaphaenusSattivus890";     
    static Connection con;
    static Scanner sc = new Scanner(System.in);

    static int managerCode; 
    Manager(int empCode){
        managerCode=empCode;
    }

    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            /*System.out.print("Enter Manager empCode: ");
            managerCode = sc.nextInt();*/
            int choice;

            do {
                System.out.println("\n===== Manager Panel =====");
                System.out.println("1. Update Profile");
                System.out.println("2. Manage Project");
                System.out.println("3. Manage Bugs");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> updateProfile();
                    case 2 -> manageProjects();
                    case 3 -> manageBugs();
                    case 4 -> System.out.println("Exiting Manager Panel...");
                    default -> System.out.println("Invalid choice!");
                }
            } while (choice != 4);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ==================== 1. Update Profile ====================
    public static void updateProfile() throws SQLException {
        System.out.print("Enter new Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Enter new Mobile No: ");
        long mobile = sc.nextLong(); sc.nextLine();

        PreparedStatement pst = con.prepareStatement(
            "UPDATE Employee SET empEmail = ?, mobileNo = ? WHERE empCode = ? AND Role = 'manager'"
        );
        pst.setString(1, email);
        pst.setLong(2, mobile);
        pst.setInt(3, managerCode);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Profile Updated Successfully!" : "Manager Not Found.");
    }

    // ==================== 2. Manage Projects ====================
    public static void manageProjects() throws SQLException {
        System.out.println("\n--- Project Menu ---");
        System.out.println("1. Add Project");
        System.out.println("2. View All Projects");
        System.out.println("3. Delete Project");
        System.out.println("4. Update Project");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1 -> addProject();
            case 2 -> viewAllProjects();
            case 3 -> deleteProject();
            case 4 -> updateProject();
            default -> System.out.println("Invalid Option");
        }
    }

    public static void addProject() throws SQLException {
    System.out.print("Enter Project ID: ");
    int pid = sc.nextInt(); sc.nextLine();
    System.out.print("Enter Project Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Start Date: ");
    String sdate = sc.nextLine();
    System.out.print("Enter End Date: ");
    String edate = sc.nextLine();
    System.out.print("Enter Description: ");
    String desc = sc.nextLine();

    PreparedStatement pst = con.prepareStatement(
        "INSERT INTO Project (projectID, projectName, SDate, EDate, projectDec) VALUES (?, ?, ?, ?, ?)"
    );
    pst.setInt(1, pid);
    pst.setString(2, name);
    pst.setString(3, sdate);
    pst.setString(4, edate);
    pst.setString(5, desc);
    pst.executeUpdate();

    PreparedStatement assignPst = con.prepareStatement(
        "INSERT INTO assignproject (projectID, empCode) VALUES (?, ?)"
    );
    assignPst.setInt(1, pid);
    assignPst.setInt(2, managerCode);
    assignPst.executeUpdate();

    System.out.println("Project Added and Assigned Successfully.");
}


    public static void viewAllProjects() throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Project");

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("projectID") +
                               ", Name: " + rs.getString("projectName") +
                               ", Start: " + rs.getString("SDate") +
                               ", End: " + rs.getString("EDate") +
                               ", Desc: " + rs.getString("projectDec"));
        }
    }

    public static void deleteProject() throws SQLException {
        System.out.print("Enter Project ID to delete: ");
        int pid = sc.nextInt();

        PreparedStatement pst = con.prepareStatement("DELETE FROM Project WHERE projectID = ?");
        pst.setInt(1, pid);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Project Deleted." : "Project ID not found.");
    }

    public static void updateProject() throws SQLException {
        System.out.print("Enter Project ID to update: ");
        int pid = sc.nextInt(); sc.nextLine();
        System.out.print("Enter new Description: ");
        String desc = sc.nextLine();

        PreparedStatement pst = con.prepareStatement("UPDATE Project SET projectDec = ? WHERE projectID = ?");
        pst.setString(1, desc);
        pst.setInt(2, pid);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Project Updated." : "Project ID not found.");
    }

    // ==================== 3. Bug Management ====================
    public static void manageBugs() throws SQLException {
        System.out.println("\n--- Bug Menu ---");
        System.out.println("1. Add New Bug");
        System.out.println("2. View All Bugs");
        System.out.println("3. Update Bug");
        System.out.println("4. Delete Bug");
        System.out.println("5. View Bug Codes & Categories");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        switch (ch) {
            case 1 -> addBug();
            case 2 -> viewAllBugs();
            case 3 -> updateBug();
            case 4 -> deleteBug();
            case 5 -> viewBugCodes();
            default -> System.out.println("Invalid Option");
        }
    }

    public static void addBug() throws SQLException {
        System.out.print("Enter Bug No: ");
        int bugNo = sc.nextInt();
        viewBugCodes(); // Show available codes
        System.out.print("Enter Bug Code (from list above): ");
        int bugCode = sc.nextInt();

        if (!isBugCodeValid(bugCode)) {
            System.out.println("Invalid Bug Code. Aborting.");
            return;
        }

        System.out.print("Enter Project ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Tester Code (TCode): ");
        int tcode = sc.nextInt();
        System.out.print("Enter Employee Code (ECode): ");
        int ecode = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Status (pending/resolved): ");
        String status = sc.nextLine();
        System.out.print("Enter Bug Description: ");
        String des = sc.nextLine();

        PreparedStatement pst = con.prepareStatement(
            "INSERT INTO BugReport (bugNo, bugCode, projectID, TCode, ECode, status, bugDes) VALUES (?, ?, ?, ?, ?, ?, ?)"
        );
        pst.setInt(1, bugNo);
        pst.setInt(2, bugCode);
        pst.setInt(3, pid);
        pst.setInt(4, tcode);
        pst.setInt(5, ecode);
        pst.setString(6, status);
        pst.setString(7, des);
        pst.executeUpdate();

        System.out.println("Bug Added Successfully.");
    }

    public static void viewAllBugs() throws SQLException {
        String query = """
            SELECT br.bugNo, bt.bugCatgory, bt.bugSeverty, br.status, br.bugDes, br.projectID
            FROM BugReport br
            JOIN BugType bt ON br.bugCode = bt.bugCode
        """;

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("Bug No: " + rs.getInt("bugNo") +
                               ", Category: " + rs.getString("bugCatgory") +
                               ", Severity: " + rs.getString("bugSeverty") +
                               ", Status: " + rs.getString("status") +
                               ", Desc: " + rs.getString("bugDes") +
                               ", Project ID: " + rs.getInt("projectID"));
        }
    }

    public static void updateBug() throws SQLException {
        System.out.print("Enter Bug No to update: ");
        int bugNo = sc.nextInt(); sc.nextLine();
        System.out.print("Enter New Status: ");
        String status = sc.nextLine();
        System.out.print("Enter New Description: ");
        String des = sc.nextLine();

        PreparedStatement pst = con.prepareStatement("UPDATE BugReport SET status = ?, bugDes = ? WHERE bugNo = ?");
        pst.setString(1, status);
        pst.setString(2, des);
        pst.setInt(3, bugNo);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Bug Updated." : "Bug Not Found.");
    }

    public static void deleteBug() throws SQLException {
        System.out.print("Enter Bug No to delete: ");
        int bugNo = sc.nextInt();

        PreparedStatement pst = con.prepareStatement("DELETE FROM BugReport WHERE bugNo = ?");
        pst.setInt(1, bugNo);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Bug Deleted." : "Bug Not Found.");
    }

    // ==================== Bug Code Helpers ====================
    public static void viewBugCodes() throws SQLException {
        System.out.println("\n--- Bug Categories ---");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM BugType");

        while (rs.next()) {
            System.out.println("Code: " + rs.getInt("bugCode") +
                               ", Category: " + rs.getString("bugCatgory") +
                               ", Severity: " + rs.getString("bugSeverty"));
        }
    }

    public static boolean isBugCodeValid(int bugCode) throws SQLException {
        PreparedStatement pst = con.prepareStatement("SELECT COUNT(*) FROM BugType WHERE bugCode = ?");
        pst.setInt(1, bugCode);
        ResultSet rs = pst.executeQuery();
        rs.next();
        return rs.getInt(1) > 0;
    }
}
//***************************************************Employee Module starts here*************************************************** 


class Employee {
    static final String URL = "jdbc:mysql://localhost:3306/BDS";
    static final String USER = "root";
    static final String PASS = "RaphaenusSattivus890";
    static Connection con;
    static Scanner sc = new Scanner(System.in);

    static int empCode;
    static String role;

    Employee(int empCode, String role){
        this.empCode=empCode;
        this.role=role;
    }
    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(URL, USER, PASS);

            /*System.out.print("Enter Employee Code: ");
            empCode = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Role (tester/developer): ");*/
            role = role.toLowerCase();

            int choice;
            do {
                System.out.println("\n===== Employee Panel =====");
                System.out.println("1. Update Profile");
                if (role.equals("tester")) {
                    System.out.println("2. Add Bug's Report");
                }
                System.out.println("3. Update Bug Status");
                System.out.println("4. View Bugs");
                System.out.println("5. Bug Details");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> updateProfile();
                    case 2 -> {
                        if (role.equals("tester")) addBugReport();
                        else System.out.println("Only testers can add bug reports.");
                    }
                    case 3 -> updateBugStatus();
                    case 4 -> viewAllBugs();
                    case 5 -> viewBugDetails();
                    case 6 -> System.out.println("Exiting Employee Panel...");
                    default -> System.out.println("Invalid choice!");
                }
            } while (choice != 6);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateProfile() throws SQLException {
        System.out.print("Enter new Email: ");
        String email = sc.nextLine();
        System.out.print("Enter new Mobile No: ");
        long mobile = sc.nextLong();
        sc.nextLine();

        PreparedStatement pst = con.prepareStatement("UPDATE Employee SET empEmail = ?, mobileNo = ? WHERE empCode = ?");
        pst.setString(1, email);
        pst.setLong(2, mobile);
        pst.setInt(3, empCode);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Profile Updated Successfully!" : "Employee Not Found.");
    }

    public static void addBugReport() throws SQLException {
        System.out.print("Enter Bug No: ");
        int bugNo = sc.nextInt();
        System.out.print("Enter Bug Code: ");
        int bugCode = sc.nextInt();
        System.out.print("Enter Project ID: ");
        int pid = sc.nextInt();
        System.out.print("Enter Developer Code (ECode): ");
        int devCode = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Bug Status (pending/resolved): ");
        String status = sc.nextLine();
        System.out.print("Enter Bug Description: ");
        String desc = sc.nextLine();

        PreparedStatement pst = con.prepareStatement("INSERT INTO BugReport (bugNo, bugCode, projectID, TCode, ECode, status, bugDes) VALUES (?, ?, ?, ?, ?, ?, ?)");
        pst.setInt(1, bugNo);
        pst.setInt(2, bugCode);
        pst.setInt(3, pid);
        pst.setInt(4, empCode);
        pst.setInt(5, devCode);
        pst.setString(6, status);
        pst.setString(7, desc);
        pst.executeUpdate();

        System.out.println("Bug Report Added Successfully.");
    }

    public static void updateBugStatus() throws SQLException {
        System.out.print("Enter Bug No to update status: ");
        int bugNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new status (pending/resolved): ");
        String status = sc.nextLine();

        PreparedStatement pst = con.prepareStatement("UPDATE BugReport SET status = ? WHERE bugNo = ? AND (TCode = ? OR ECode = ?)");
        pst.setString(1, status);
        pst.setInt(2, bugNo);
        pst.setInt(3, empCode);
        pst.setInt(4, empCode);
        int rows = pst.executeUpdate();

        System.out.println(rows > 0 ? "Bug Status Updated." : "Bug Not Found or Access Denied.");
    }

    public static void viewAllBugs() throws SQLException {
        Statement st = con.createStatement();
        PreparedStatement pst = con.prepareStatement("SELECT * FROM BugReport where (TCode = ? OR ECode = ?)");
        pst.setInt(1, empCode);
        pst.setInt(2, empCode);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            System.out.println("Bug No: " + rs.getInt("bugNo") + ", Status: " + rs.getString("status") + ", Project ID: " + rs.getInt("projectID"));
        }
    }

    public static void viewBugDetails() throws SQLException {
        System.out.print("Enter Bug No: ");
        int bugNo = sc.nextInt();
        sc.nextLine();

        String query = "SELECT br.*, bt.bugCatgory, bt.bugSeverty FROM BugReport br JOIN BugType bt ON br.bugCode = bt.bugCode WHERE br.bugNo = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, bugNo);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            System.out.println("Bug No: " + rs.getInt("bugNo"));
            System.out.println("Category: " + rs.getString("bugCatgory"));
            System.out.println("Severity: " + rs.getString("bugSeverty"));
            System.out.println("Status: " + rs.getString("status"));
            System.out.println("Description: " + rs.getString("bugDes"));
            System.out.println("Project ID: " + rs.getInt("projectID"));
        } else {
            System.out.println("Bug not found.");
        }
    }
}

class SourceCode {
    static final String URL = "jdbc:mysql://localhost:3306/BDS";
    static final String USER = "root";
    static final String PASS = "RaphaenusSattivus890";
    static Connection con;

    public static void main(String[] args) {
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);
            System.out.println("<<<<<<<<<<<<<<<< WELCOME! >>>>>>>>>>>>>>>>");
            System.err.println("");
            while (true) {
                System.out.println("========== LOGIN ==========");
                System.out.print("Enter your Employee ID: ");
                int empCode = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your Password: ");
                String password = sc.nextLine();

                String sql = "SELECT * FROM Employee WHERE empCode = ? AND empPassword = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, empCode);
                pst.setString(2, password);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    String role = rs.getString("Role").toLowerCase();
                    System.out.println("\nLogin Successful! \nLogged in as: " + role.toUpperCase());

                    switch (role) {
                        case "admin":
                            Admin a=new Admin();
                            a.main(null);
                            break;
                        case "manager":
                            Manager m=new Manager(empCode);
                            m.main(null);
                            break;
                        case "tester": 
                            Employee et=new Employee(empCode, "tester");
                            et.main(null);
                            break;
                        case "developer":
                            Employee ed=new Employee(empCode, "developer");
                            ed.main(null);
                            break;
                        default:
                            System.out.println("Unknown role. Please contact system admin.");
                    }
                    break;
                } else {
                    System.out.println("Invalid credentials. Please try again.\n");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
