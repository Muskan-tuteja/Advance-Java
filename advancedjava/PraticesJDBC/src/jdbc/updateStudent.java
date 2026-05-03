package jdbc;
import java.sql.*;
import java.io.*;

public class updateStudent {
	public static void main(String[] args) {
		try {
			//load the Driver
			Class.forName("org.postgresql.Driver");
//			creating a connection
			String url = "jdbc:postgresql://localhost:5432/students_managements";
			String username = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,username,password);
		
			
			String q = "update table1 set tName=?,tCity=? where tId=?";
			
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("Enter new name : ");
			String name = br.readLine();
			
			
			 System.out.println("Enter new city  : ");
			 String city = br.readLine();
			
			 
			 System.out.println("Enter the Student id :");
			 
			 int id = Integer.parseInt(br.readLine());
		
			 PreparedStatement patmt = connection.prepareStatement(q);
		
			 patmt.setString(1, name);
			 patmt.setString(2, city);
			 patmt.setInt(3, id);
		
			 patmt.executeUpdate();
			 System.out.println("done....");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
