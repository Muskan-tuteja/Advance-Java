package com.teacher;
import java.sql.*;

public class example {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/teacherdatabase";
            String username = "postgres";
            String password = "root";

            connection = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO teacher VALUES (?, ?, ?)");

            // First record
            ps.setInt(1, 1);
            ps.setString(2, "isha");
            ps.setString(3, "math");
            ps.addBatch();

            // Second record
            ps.setInt(1, 2);
            ps.setString(2, "muskan");
            ps.setString(3, "science");
            ps.addBatch();

            // Execute batch
            ps.executeBatch();

            System.out.println("Batch executed successfully!");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}