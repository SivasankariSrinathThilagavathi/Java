import java.sql.*;
import java.util.Scanner;

public class Movie {
    static final String URL = "jdbc:mysql://localhost:3306/MovieDB";
    static final String USER = "root";
    static final String PASS = "pass";

    static final int ROWS = 5;
    static final int COLS = 20;

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASS);
             Scanner sc = new Scanner(System.in)) {

            int choice;
            do {
                System.out.println("\n==== Movie Seat Booking ====");
                System.out.println("1. View Seats");
                System.out.println("2. Book a Seat");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> viewSeats(con);
                    case 2 -> bookSeat(con, sc);
                    case 3 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid option.");
                }

            } while (choice != 3);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void viewSeats(Connection con) throws SQLException {
        System.out.println("\nSeat Map (AV = Available, BK = Booked)");
        System.out.print("     ");
        for (int c = 1; c <= COLS; c++) System.out.printf("%3d", c);
        System.out.println();

        for (int r = 1; r <= ROWS; r++) {
            System.out.printf("R%-3d", r);
            for (int c = 1; c <= COLS; c++) {
                String status = getSeatStatus(con, r, c);
                System.out.printf("%3s", status != null ? status : "--");
            }
            System.out.println();
        }
    }

    public static void bookSeat(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter row (1-5): ");
        int row = sc.nextInt();
        System.out.print("Enter column (1-20): ");
        int col = sc.nextInt();

        String currentStatus = getSeatStatus(con, row, col);

        if (currentStatus == null) {
            System.out.println("Invalid seat number.");
        } else if (currentStatus.equals("BK")) {
            System.out.println("That seat is already booked.");
        } else {
            String update = "UPDATE Seats SET status = 'BK' WHERE row_num = ? AND col_num = ?";
            PreparedStatement ps = con.prepareStatement(update);
            ps.setInt(1, row);
            ps.setInt(2, col);
            ps.executeUpdate();
            ps.close();
            System.out.println("Seat R" + row + "C" + col + " booked successfully.");
        }
    }

    public static String getSeatStatus(Connection con, int row, int col) throws SQLException {
        String query = "SELECT status FROM Seats WHERE row_num = ? AND col_num = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, row);
        ps.setInt(2, col);
        ResultSet rs = ps.executeQuery();
        String status = null;
        if (rs.next()) {
            status = rs.getString("status");
        }
        rs.close();
        ps.close();
        return status;
    }
}
