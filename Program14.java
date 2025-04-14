
import java.sql.*;

public class Program14 {

    public static void main(String[] args) {
        String dbPath = "C:/databases/ExampleDB.accdb";
        String url = "jdbc:ucanaccess://" + dbPath;

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connected to Access Database");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");

            System.out.println("ID\tName\t\tDepartment");
            System.out.println("-------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String department = rs.getString("Department");
                System.out.println(id + "\t" + name + "\t\t" + department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
