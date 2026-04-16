package com.student;

import java.sql.*;

public class JDBCStudent {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/studentdatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			String query = "create table student(name varchar(20) , age numeric(2) , id numeric(4) primary key);";
			
			statement.execute(query);
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}	
