package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {

        try {
            // load driver
            Class.forName("org.postgresql.Driver");

            // create connection
            String url = "jdbc:postgresql://localhost:5432/studentdatabase";
            String username = "postgres";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, username, password);

            // create prepared statement
            String query = "INSERT INTO student VALUES (?,?,?)";
            PreparedStatement prepare = connection.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter employee id:");
            prepare.setInt(1, sc.nextInt());
            sc.nextLine();

            System.out.println("Enter name:");
            prepare.setString(2, sc.nextLine());


            System.out.println("Enter Age:");
            prepare.setDouble(3, sc.nextDouble());
            sc.nextLine();


            prepare.executeUpdate();

            System.out.println("Record Inserted");

            connection.close();
            sc.close();

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }
}
