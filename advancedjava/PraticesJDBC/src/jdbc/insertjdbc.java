package jdbc;
import java.sql.*;
import java.io.*;

public class insertjdbc {
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
			String q = "insert into table1(tName,tCity) values(?,?)";
//			get the preparedstatemet object
			PreparedStatement pstmt = connection.prepareStatement(q);
//			BufferedReader maltiple name and city add used this bufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name :");
			String name=br.readLine();
			
			System.out.println("Enter city :");
			String City = br.readLine();
			//set the values to query
			pstmt.setString(1, name);
			pstmt.setString(2, City);
			pstmt.executeUpdate();
			System.out.println("insert crated in database..");
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
