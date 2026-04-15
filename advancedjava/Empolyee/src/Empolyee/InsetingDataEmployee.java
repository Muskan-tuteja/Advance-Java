package Empolyee;

import java.sql.*;

public class InsetingDataEmployee {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");	
			
			//Create a connection
			String url = "jdbc:postgresql://localhost:5432/employeedatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement statement = connection.createStatement();
			
//			String que = "insert into employee values('Dev' ,28000 , 0001 , 'Faridabad');";
//			String que = "insert into employee values('Amit' ,22000, 0002, 'Gurugram');";
//			String que = "insert into employee values('Divya' ,24000, 0003 , 'Farrukh Nagar');";
//			String que = "insert into employee values('Nancy' ,230000, 0004, 'Washington');";
			String que = "insert into employee values('Sweekriti' ,240099, 0005, 'New York');";
			
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
