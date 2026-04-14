package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcstep {
	public static void main(String[] args) {
		
	
	try {
//		load the driver
		Class.forName("org.postgresql.Driver");
//		Create a connection
		String url = "jdbc:postgresql://localhost:5432/m6jdbc";
		String username="postgres";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println(connection);
		
//		Create a statement
		Statement statement = connection.createStatement();
//		execute a stm amd process a result
		
		//String query="create table student(St_Id Numeric(10) PRIMARY KEY,SNAME VARCHAR(10))";
//		String query = "insert into student values(101,'mahi')";
		String query = "update student set SNAME = 'a';";
		
//		statement.execute(query);
		int i = statement.executeUpdate(query);
		System.out.println(i);
//		close a connection
		connection.close();
		
		
	}catch(ClassNotFoundException e) 
	{
		e.printStackTrace();
	
	}catch(SQLException e) {
		e.printStackTrace();
	}

	}
}

