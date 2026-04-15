package Empolyee;

import java.sql.*;

public class JDBCEmployee {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/employeedatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			String query = "create table employee(ename varchar(20) , sal numeric(9) , empid numeric(4) primary key, loc varchar(15));";
			
			statement.execute(query);
			
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}	
