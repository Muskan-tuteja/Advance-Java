package com.student;

import java.sql.*;

public class InsertingDataStudent {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/studentdatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
			String que = "insert into student values('Rahul' ,22, 1001);";
//			String que = "insert into student values('Priyanshu' ,22, 1002);";
//			String que = "insert into student values('Anjali' ,24, 1003);";
//			String que = "insert into student values('Sharik' ,23, 1004);";
//			String que = "insert into student values('Amritanshu' ,24, 1005);";
			
//			  
			
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
