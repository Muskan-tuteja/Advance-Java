package com.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Deletingdata {
public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/teacherdatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
			String que = "delete from teacher where name = 'Riya';"; //deleted
			
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
