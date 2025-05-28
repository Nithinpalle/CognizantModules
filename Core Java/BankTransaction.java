import java.sql.*;

public class BankTransaction {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 500 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE id = 2");

            conn.commit();
            System.out.println("Transaction successful.");
        } catch (Exception e) {
            System.out.println("Transaction failed. " + e.getMessage());
        }
    }
}
