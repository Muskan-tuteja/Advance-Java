package jdbc;
import java.sql.*;

public class ImageCreate {
	public static void main(String[] args) {
		try {
			//load the Driver
			Class.forName("org.postgresql.Driver");
//			creating a connection
			String url = "jdbc:postgresql://localhost:5432/images_management";
			String username = "postgres";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//create a query
			String q = "CREATE TABLE image1(tId SERIAL PRIMARY KEY , tName VARCHAR(200) NOT NULL,  photo BYTEA);";
			
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
