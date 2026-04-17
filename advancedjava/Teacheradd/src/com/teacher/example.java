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

            int id = 10; // correct datatype

//            PreparedStatement preparedStatement =
//                    connection.prepareStatement("select * from student where id = ?");
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO student (id, name) VALUES (?, ?)");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "isha");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

            System.out.println("Batch executed successfully!");

//            preparedStatement.setInt(1, id); // value set

            ResultSet query = preparedStatement.executeQuery();

            while (query.next()) {
                System.out.println(query.getInt(1) + " || ");
                System.out.println(query.getString(2));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
