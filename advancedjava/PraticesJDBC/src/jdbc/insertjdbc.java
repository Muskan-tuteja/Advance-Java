package jdbc;
import java.sql.*;

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
			//set the values to query
			pstmt.setString(1, "Musus");
			pstmt.setString(2, "Hansi");
			pstmt.executeUpdate();
			System.out.println("insert crated in database..");
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
