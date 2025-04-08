
import java.sql.*;

public class Program14 {

    public static void main(String[] args) {
        String dbFile = "sample.accdb"; // Path to your Access DB
        String url = "jdbc:ucanaccess://" + dbFile;

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connected to the Access database.");

            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM YourTableName"; // Replace with your table name
            ResultSet rs = stmt.executeQuery(query);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Display table content
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metaData.getColumnName(i) + ": " + rs.getString(i) + "\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
