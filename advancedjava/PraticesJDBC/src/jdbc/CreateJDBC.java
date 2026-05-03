package jdbc;
import java.sql.*;

public class CreateJDBC {
	public static void main(String[] args) {
		try {
			//load the Driver
			Class.forName("org.postgresql.Driver");
//			creating a connection
			String url = "jdbc:postgresql://localhost:5432/students_managements";
			String username = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//create a query
			String q = "CREATE TABLE table1(tId SERIAL PRIMARY KEY , tName VARCHAR(200) NOT NULL, tCity VARCHAR(400));";
			
//			create a statement:
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table crated in database..");
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
