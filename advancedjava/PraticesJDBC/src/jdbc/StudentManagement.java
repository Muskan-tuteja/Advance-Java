package jdbc;
import java.sql.*;
public class StudentManagement {
	public static void main(String[] args) {
		try {
//			load the Driver
			Class.forName("org.postgresql.Driver");
//			creating a connection
			String url = "jdbc:postgresql://localhost:5432/students_managements";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url,username,password);
			if(connection.isClosed()) {
				System.out.println("Connection is Closed");
				
			}else {
				System.out.println("Connection is Created..");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
