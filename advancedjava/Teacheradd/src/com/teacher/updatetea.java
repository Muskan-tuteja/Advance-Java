package com.teacher;
 
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatetea {
public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/studentdatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
			String que = "update student set id = 10009 where name = 'Muskan';"; //Updated
			
			statement.executeUpdate(que);
			
			connection.close();
		} 
		catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
