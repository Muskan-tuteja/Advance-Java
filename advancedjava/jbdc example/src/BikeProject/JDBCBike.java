package BikeProject;
import java.sql.*;

public class JDBCBike {
public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/bikedatabase";
			String username = "postgres";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(url, username, password);
			
			Statement statement = connection.createStatement();
			
			String query = "create table Bike(brand varchar(10) , price numeric , model varchar(10));";
			
			statement.execute(query);
			
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
